package designPattern.singletonPattern;

public class SingletonLazy {


    private static SingletonLazy instance;


    private SingletonLazy(){
        System.out.println("Constructor called by: " + Thread.currentThread().getName());
    }

    public static SingletonLazy getInstance(){
        if(instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}

class LazyMain{
    public static void main(String[] args) {
        Runnable task = () -> {
            SingletonLazy connection = SingletonLazy.getInstance();
            System.out.println("Instance hashcode: " + connection.hashCode());
        };

        // Run with multiple threads
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
