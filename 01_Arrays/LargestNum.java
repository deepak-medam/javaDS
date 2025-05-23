public class LargestNum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }

        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 6, 3, 5, 35};
        System.out.println(getLargest(numbers));

    }
}
