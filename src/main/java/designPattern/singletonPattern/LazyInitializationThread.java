package designPattern.singletonPattern;

public class LazyInitializationThread {

    private static volatile LazyInitializationThread instance;

    private LazyInitializationThread(){
        System.out.println("Constructor called by: " + Thread.currentThread().getName());
    }


    public static LazyInitializationThread getInstance() {
        if (instance == null) {
            synchronized (LazyInitializationThread.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(100); // simulate delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new LazyInitializationThread();
                }
            }
        }
        return instance;
    }

}

class LazyThreadSafe{
    public static void main(String[] args) {
        Runnable task = () -> {
            LazyInitializationThread connection = LazyInitializationThread.getInstance();
            System.out.println("Instance hashcode: " +connection.hashCode() );
        };

        // Run with multiple threads
        Thread t1 = new Thread(task, "ThreadSafe-1");
        Thread t2 = new Thread(task, "ThreadSafe-2");
        Thread t3 = new Thread(task, "ThreadSafe-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
