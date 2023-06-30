import java.util.Scanner;

class Seven {

    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the number: ")
        int n = scanObj.nextInt();
        int value;
        for (int i = 1; i <=10; i++) {
            value = i*n;
            System.out.println(i+"x"+n+"="+ value);
        }
    }
    }