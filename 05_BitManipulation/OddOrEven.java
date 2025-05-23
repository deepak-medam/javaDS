public class OddOrEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // even
            System.out.println("even number");
        } else{
            System.out.println("Odd number");
        }
    }
    public static void main(String args[]){
        oddOrEven(9);
    }
    
}
