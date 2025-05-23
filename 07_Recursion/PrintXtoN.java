public class PrintXtoN {
    public static int xPowN(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * xPowN(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(xPowN(2, 10));
    }
    
}
