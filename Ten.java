import java.util.Scanner;

class Ten {

    public static void main(String[] args) {
        int i,j,k,size,temp;
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enrer array size:");
        size=scanobj.nextInt();
        int array1[] = new int[size];
        int array2[] = new int[size];
        System.out.println("Enter array1 elements:");
        for ( i = 0; i < size; i++) {
            array1[i]= scanobj.nextInt();
        }
        System.out.println("Enter array2 elements:");
        for (k = 0; k < size; k++) {
            array2[k]=scanobj.nextInt();
        }
        for( i = 0; i < array1.length; i++ ){
            temp=array1[i];
            array1[i]=array2[i];
            array2[i]=temp;
        }
        System.out.println("Array after swapping");
        System.out.print("Array1 : ");
        for (k = 0; k < array2.length; k++) {
            System.out.print(array1[k]+" ");
        }
        System.out.print("\nArray2 : ");
        for (int k2 = 0; k2 < array2.length; k2++) {
            System.out.print(array2[k2]+" ");
        }
    }
}