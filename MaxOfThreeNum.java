public class MaxOfThreeNum {
    public static void main(String []args){
        int a=200, b=1000, c=4000;
        int result;
        if(a>b) {
            if (a > c)
                result = a;
            else
                result = c;
        }
        else{
            if(b>c)
                result = b;
            else
                result = c;
        }
        System.out.println("Maximum of three numbers is " + result);
    }
}
