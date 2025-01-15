public class ClimbingTab {
    public static int ways(int n) {
        int ways[] = new int[n + 1];
        ways[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ways[i] = ways[i - 1] + 0;
            } else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }
        return ways[n];
    }

    public static void main(String args[]) {
        System.out.println(ways(5));
    }

}
