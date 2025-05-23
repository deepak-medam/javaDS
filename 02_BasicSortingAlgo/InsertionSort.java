public class InsertionSort {
    public static void printArr(int arr[]){
        System.out.print("[");
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }

    public static void insertionSort(int arr[]){
        for(int i =1; i < arr.length; i ++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }

    }

    public static void main(String args[]){
        int numbers[] = {5, 4, 1, 3, 2};
        insertionSort(numbers);
        printArr(numbers);
    }
    
}
