import java.util.Scanner;

public class PrimeNumber {
    public static void main(String []args){
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
//for loop run for i=2 to i=sqaure root of 'n' because a factor of 'n' can be found in this range
        for(int i=2 ; i*i <= n ; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(n<2)
            isPrime = false;

        System.out.println("Number is prime: " + isPrime);
    }
}
