public class StringReverse {
    public static void main(String[] args){
        String str = "xyz";
        String rev = "";
        char c[] = str.toCharArray();
        for (int i=c.length-1; i>=0; i--){
            rev += c[i];
        }
        System.out.print(rev);
    }
}
