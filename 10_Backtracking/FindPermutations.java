public class FindPermutations{
    public static void stringPermutations(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
        }

        // recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1); 
            // yes choice
            stringPermutations(newStr, ans+curr);

            // no choice
        }
    }
    public static void main(String args[]){
        String str = "abc";
        stringPermutations(str, "");
    }
}