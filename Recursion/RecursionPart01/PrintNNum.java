public class PrintNNum {

    public static int printNNum(int n) {
        if (n == 1) {
            return n;
        }
        return n + printNNum(n - 1);
    }

    public static void main(String args[]) {
        System.out.println(printNNum(10));
    }

}
