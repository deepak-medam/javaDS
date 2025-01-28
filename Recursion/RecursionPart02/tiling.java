public class tiling {

    public static int tilingProb(int n) {
        // Base case
        // if n == 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Action
        // If i chose to place the tile vertically I will call tiling(n-1) because only
        // n-1 floor is left.
        int verticalChoi = tilingProb(n - 1);

        // If i chose to place the tile horizontally I have to place the second tile
        // horizontally as well I will call tiling(n-2) as only n-2 floor is left.
        int horizontalChoi = tilingProb(n - 2);

        int totalWays = verticalChoi + horizontalChoi;
        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(tilingProb(15));
    }
}
