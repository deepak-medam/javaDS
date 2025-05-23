import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {

    public static void printArr(Integer arr[]){
        System.out.print("[");
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }



    public static void main(String args[]){
        Integer numbers[] = {5, 4, 1, 3, 2};
        Arrays.sort(numbers);
        printArr(numbers);
        Arrays.sort(numbers, Collections.reverseOrder());
        printArr(numbers);


    }
}
