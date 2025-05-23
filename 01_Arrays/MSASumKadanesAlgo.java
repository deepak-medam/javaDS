public class MSASumKadanesAlgo {

    public static void kadanesMaxSubarrSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<numbers.length; i++){
            currSum += numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }

        System.out.println("Max sum = " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int numbers1[] = {1, -2, 6, -1, 3};
        int numbers2[] = {2, 4, 6, 8, 10};
        kadanesMaxSubarrSum(numbers);
        kadanesMaxSubarrSum(numbers1);
        kadanesMaxSubarrSum(numbers2);
    }
    
}
