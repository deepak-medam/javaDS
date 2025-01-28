public class NumInDecending {

    public static void printDecending(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDecending(n - 1);
    }

    public static void main(String args[]) {
        printDecending(11);
    }

}
