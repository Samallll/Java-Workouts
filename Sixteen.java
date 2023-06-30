import java.util.Scanner;

class Sixteen {
    public static void main(String[] args) {
        
        boolean flag=false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        for (int i = 2; i <= num/2; i++) {
            if (num%2==0) {
                flag=true;
                break;
            }
        }

        if (!flag) {
            System.out.println(" Entered number is a Prime number");
        }else{
            System.out.println(" Entered number is not Prime number");
        }
    }
}