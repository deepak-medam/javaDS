import java.util.Scanner;
public class Matrices {

    public static boolean search(int matrix[][], int key){
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at cell number (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void printMatrix(int arr[][]){
        int n = arr.length, m = arr[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("Enter the value for cell number (" + i +", "+ j + "): " );
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix(matrix);
        int key = 5;

        search(matrix, key);

    }
}
