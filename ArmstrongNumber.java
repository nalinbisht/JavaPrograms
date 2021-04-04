import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String []args){
        System.out.print("Enter the number to be checked:153 ");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int remainder,copyOfNum, Sum=0;
        copyOfNum=Num;
        while (Num > 0){
            remainder = Num % 10;
            Sum = Sum + (remainder*remainder*remainder);
            Num = Num/10;
        }
        if(copyOfNum==Sum)
            System.out.println("It is a Armstrong number.");
        else
            System.out.println("It is not a Armstrong number.");
    }
}
//A positive number is called armstrong number if it is equal to the sum of cubes of its digits. e.g.,153