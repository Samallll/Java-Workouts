import java.util.Scanner;

class TwentyTwo {
    
    static Scanner scanObj;
    int arr[][] = new int[2][2];
    int arr1[][] = new int[2][2];
    int sum[][] = new int[2][2];

    void getArray(){
        System.out.println("Enter first array Elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=scanObj.nextInt();
            }
        }
        System.out.println("Enter second array Element");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               arr1[i][j]=scanObj.nextInt(); 
            }
        }
    }

    void addArray(){
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 sum[i][j]= arr[i][j]+arr1[i][j];
            }
        }
    }
    
    void displayArray(){
        System.out.println("Sum of array 1 and array 2:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwentyTwo obj = new TwentyTwo();
        scanObj = new Scanner(System.in);
        obj.getArray();
        obj.addArray();
        obj.displayArray();
    }
}   