package recursion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class RecursionPractice {


    public static  int fact(int n){
        if(n==0){
            return 1;
        }

        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }

    public static int sumOf(int n){
        if(n==1){
            return 1;
        }

        int currSum=sumOf(n-1);
        int fn=n+currSum;

        return fn;
    }

    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + digitSum(n / 10);
    }

    public static int fibnacanio(int n){

        if(n==0 || n==1){
            return n;
        }

        int fn1=fibnacanio(n-1);
        int fn2=fibnacanio(n-2);


        return fn1+fn2;

    }

    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }

        int rem=n%10;

        return rem*(int) Math.pow(10,digits-1)+helper(n/10,digits-1);
    }

    public static int reverse(int n){


        int digits=(int)(Math.log10(n))+1;

        return helper(n,digits);

    }

    public static void main(String[] args) {

        System.out.println( fact(5));


        LocalDate birthDate=LocalDate.of(1998,7,13);

        LocalDate today=LocalDate.now();

        long daysBetween = ChronoUnit.YEARS.between(birthDate, today);

        System.out.println("Days from birth until today: " + daysBetween);

        System.out.println( sumOf(3));

        System.out.println();

        int fib=fibnacanio(4);

        System.out.println(fib);

        System.out.println("sum of digit: "+digitSum(123));

        System.out.println("reverse the number");



        System.out.println(reverse(1564));


    }
}
