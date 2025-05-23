public class BubbleSort{
    public static void bubbleSort(int numbers[]){
        for(int turn = 0; turn<numbers.length-1; turn++){
            for(int j = 0; j<numbers.length-1- turn; j++){
                if(numbers[j] > numbers[j+1]){
                    //swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }

            }

        }
    }

    public static void printArr(int arr[]){
        System.out.print("[");
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[] = {5, 4, 1, 3, 2};
        bubbleSort(numbers);
        printArr(numbers);
    }
}