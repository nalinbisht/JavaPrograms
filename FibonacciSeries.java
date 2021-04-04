//program to print first n elements of Fibonacci Series
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String []args){
        System.out.print("Enter value of n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a+" "+b+" ");

        for(int i=0 ; i<n-2 ; i++){
            c = a + b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
