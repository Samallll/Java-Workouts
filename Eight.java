import java.util.Scanner;

class Eight {

    public static void main(String[] args) {
        int sum=0;
        Scanner scanObj = new Scanner(System.in);
        int value= scanObj.nextInt();
        for( int i=1 ; i<=value ; i++ ){
            if (i%2!=0) {
                 sum=sum+i;
            }
        }
        System.out.println("Sum of Odd numbers = "+sum);
    }
}