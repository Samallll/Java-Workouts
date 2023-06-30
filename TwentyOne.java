import java.util.Scanner;

class TwentyOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int size=s.nextInt();
        int arr[] = new int[size];
        int arr2[] = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Output :\n");
        for (int i = 0; i < size-1; i++) {
            arr2[i]=arr[i]*arr[i+1];
            System.out.print(arr2[i]+"\t");
        }
    }
}