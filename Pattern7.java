import java.util.Scanner;

public class Pattern7 {
    public static void main(String []args){
        System.out.print("Enter the value of n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int number=1;

        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n-i ; j++){
                System.out.print("  "); //printing two spaces
            }
            for (int j=1 ; j<=i ; j++){
                System.out.print(number++ +"   "); //printing number + three spaces
            }
            System.out.println();
        }
    }
}
/*
Pattern(for n=4)
      1
    2   3
  4   5   6
7   8   9   10
 */
