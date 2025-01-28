public class PrintNFibnum {
    public static int findFib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return findFib(n - 1) + findFib(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(findFib(2));
    }

}
