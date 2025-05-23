public class PrintXtoNOptim { //O(logn)
    public static int xPowN(int x, int n){
        // Base case
        if(n == 0){
            return 1;
        }
        int halfpower = xPowN(x, n/2);
        int halfPowerSq = halfpower * halfpower;
        
        if(n % 2 != 0){
            halfPowerSq =  x * halfPowerSq;
        }
        
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(xPowN(2, 10));
    }
    
    
}
