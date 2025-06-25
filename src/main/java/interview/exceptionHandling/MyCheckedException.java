package interview.exceptionHandling;

public class MyCheckedException extends Exception{

    public MyCheckedException(String message) {
        super(message);
    }
}

//➤ Behavior:
//Must be handled explicitly with try-catch or declared with throws.

class MainCheckedException{

    public static void riskyMethod() throws MyCheckedException {
        throw new MyCheckedException("Something went wrong!");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (MyCheckedException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
