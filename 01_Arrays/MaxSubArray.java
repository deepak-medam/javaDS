public class MaxSubArray {
    public static void maxSubarray(int numbers[]){
        int ts = 0;
        int currSum = 0;
        int maxSubSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                    currSum += numbers[k];
                }
                ts++;
                if(currSum > maxSubSum){
                    maxSubSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
        System.out.println("Maximum sum of a sub array is: " + maxSubSum);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarray(numbers);
    }
}