public class NumInAscending {
    public static void printAsc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printAsc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        printAsc(5);
        System.out.println();
    }
}
