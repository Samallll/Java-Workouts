import java.util.Scanner;

class Eleven {
    public static void main(String[] args) {
        int count=0;
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int size = scanObj.nextInt();
        int array[] = new int[size];
        System.out.println("Enter Arary Elements");
        for (int j = 0; j < size; j++) {
            array[j]=scanObj.nextInt();
            if (array[j]%2==0) {
                count++;
            }
        }
        System.out.println("Number of even numbers in the given array is "+count);
    }
}