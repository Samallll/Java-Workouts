import java.util.Scanner;

class Twelve {
    public static void main(String[] args) {
        int temp;
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scanObj.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < size; i++) {
            array[i]=scanObj.nextInt();
        }

        for (int j = 0; j < size-1; j++) {
            for (int l = j+1; l < size; l++) {
                if (array[j] < array[l]) {
                    temp =array[j];
                    array[j]=array[l];
                    array[l]=temp;
                }
            }
        }
        System.out.println("Sorted array: \n");
        
        for (int k = 0; k < size; k++) {
            System.out.println(array[k]+" ");
        }

    }
}