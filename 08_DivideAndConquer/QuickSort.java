public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        // pivot is last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[], int si, int ei){
        int piviot = arr[ei];
        int i = si-1; // to make place smaller than pivot
        for(int j =si; j < ei; j++){
            if(arr[j] <= piviot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap
        int temp = piviot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[])    {
        int arr[] = {6, 3, 9, 8, 2, 5, -5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
