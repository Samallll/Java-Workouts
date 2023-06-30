import java.util.Scanner;

class Fourteen {
    public static void main(String[] args) {
        
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = scanObj.nextInt();
        int arr1[][] = new int[size][size];
        int arr2[][] = new int[size][size];
        int arr3[][] = new int[size][size];

        System.out.println("Enter the values of array 1");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=scanObj.nextInt();
            }
        }

        System.out.println("Enter the values of array 2");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j]=scanObj.nextInt();
            }
        }
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("Sum of two arrays is:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}