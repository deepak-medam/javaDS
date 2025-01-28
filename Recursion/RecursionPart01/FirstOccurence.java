public class FirstOccurence {

    public static int firstOccurence(int arr[], int k, int i) {
        // check if current element has the key if it does retun the index
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == k) {
            return i;
        }
        return firstOccurence(arr, k, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurence(arr, 11, 0));
    }

}
