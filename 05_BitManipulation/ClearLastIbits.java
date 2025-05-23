public class ClearLastIbits {
    public static int clearLastIbits(int n, int i){
        int bitMask = ~(0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearLastIbits(15, 2));
    }
}
