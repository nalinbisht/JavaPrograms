//Series: 1 - 1/2 + 1/3 - 1/4 + ....... 1/n
import java.util.Scanner;

public class SumOfSeries2 {
    public static void main(String []args){
        System.out.print("Enter value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float Sum=0;
        for(float i=1; i<=n ; i++){
            if(i%2 == 0)
                Sum -= 1/i;
            else
                Sum += 1/i;
        }
        System.out.println("Sum of Series is: "+ Sum);
    }
}
