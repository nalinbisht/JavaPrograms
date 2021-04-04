import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String []args){
        System.out.print("Enter the number to be checked ");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int remainder,copyOfNum, Sum=0;
        copyOfNum=Num;
        while (Num > 0){
            remainder = Num % 10;
            Sum = (Sum * 10) + remainder;
            Num = Num/10;
        }
        if(copyOfNum==Sum)
            System.out.println("It is a palindrome number.");
        else
            System.out.println("It is not a palindrome number.");
    }
}
//A palindrome number is a number that is same after reverse.