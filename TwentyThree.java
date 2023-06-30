import java.util.Scanner;

class TwentyThree {

    int arr[][],rows,columns;
    static Scanner scanObj;

    void getArray(){
        System.out.println("Enter array rows");
        rows=scanObj.nextInt();
        System.out.println("Enter columns");
        columns=scanObj.nextInt();
        arr=new int[rows][columns];
        System.out.println("Enter elements of the array");
        for (int i = 0; i <rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.println("Enter array position ["+i+"]["+j+"]: ");
                    arr[i][j]=scanObj.nextInt();
                }
            }
        }

    void displayArray(){
        System.out.println("The Elements of the array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }    
    }

    
    public static void main(String[] args) {
        TwentyThree obj = new TwentyThree();
        scanObj = new Scanner(System.in);
        obj.getArray();
        obj.displayArray();
    }
}