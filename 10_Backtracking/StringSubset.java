public class StringSubset {
    public static void printSubset(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        printSubset(str, ans+str.charAt(i), i+1);;
        // No choice
        printSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubset(str, "", 0);
    }
    
}
