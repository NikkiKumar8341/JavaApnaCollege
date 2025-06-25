package interview.exceptionHandling;

public class MyUncheckedException extends RuntimeException{

    public MyUncheckedException(String message){
        super(message);
    }



}

class MyUnCheckedExceptionHandle{

    public static void riskyMethod() {
        throw new MyUncheckedException("Something went wrong! unChckedException");
    }

    public static void main(String[] args) {
        riskyMethod(); // No compiler error
    }

}
