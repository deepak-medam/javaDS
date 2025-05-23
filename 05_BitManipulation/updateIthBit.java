public class updateIthBit {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return (n|bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit){
        /*
        Method 01
        if(newBit == 0){
            return clearIthBit(n, i);
        } else{
            return setIthBit(n , i);
        }
        */
        // Method 02
        clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }

    public static void main(String args[]){
        System.out.println(updateIthBit(10, 2, 1));
    }
}
