/* An anagram of a string is another string that contains the same characters,
   only the order of characters can be different. */
public class StringAnagram {
    public static void main(String []args){
        String a = "cat";
        String b = "act";

        //1st Method
        boolean isAnagram = true;

        int[] al=new int[256];
        int[] bl=new int[256];

        for (char item: a.toCharArray()) {
            int index = (int)item;
            al[index]++;
        }

        for (char item: b.toCharArray()) {
            int index = (int)item;
            bl[index]++;
        }

        for (int i=0; i<256; i++){
            if (al[i] != bl[i]){
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("Is Anagram");
        else
            System.out.println("Is Not Anagram");
    }
}

/*      2nd Method - time complexity is more in this method

        boolean isAnagram = false;
        boolean[] visited = new boolean[b.length()];
        if (a.length() == b.length()){
            for (int i=0 ;i<a.length(); i++){
                char c=a.charAt(i);
                isAnagram = false;
                for (int j=0; j<b.length(); j++){
                    if (b.charAt(j) == c && !visited[j]){
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram){
                    break;
                }
            }
        }
        if (isAnagram)
            System.out.println("Is Anagram");
        else
            System.out.println("Is Not Anagram");
    }
}                                                   */