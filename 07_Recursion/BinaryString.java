public class BinaryString {
    public static void printBinaryString(String str, int n, int lp){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinaryString(str+"0", n-1, 0);
        if(lp == 0){
            printBinaryString(str+"1", n-1, 1);
        }

    }

    public static void main(String args[]){
        printBinaryString("", 3, 0);
    }
    
}
