import java.util.Scanner;

class Seventeen {

    static Scanner s = new Scanner(System.in);
    
    void addition() {
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.println("Result is :" + sum);
    }

    void multiplication() {

        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        int sum = num1 * num2;
        System.out.println("Result is :" + sum);
    }

    void substrasction() {
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        int sum = num1 - num2;
        System.out.println("Result is:" + sum);

    }

    void division() {
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        int sum = num1 / num2;
        System.out.println("Result is :" + sum);

    }

    public static void main(String[] args) {

        Seventeen obj = new Seventeen();

        System.out.println("1.Addition");
        System.out.println("2.Multiplicaton");
        System.out.println("3.Substraction");
        System.out.println("4.Division");
        System.out.println("Select Function to calculate:");
        int value = s.nextInt();

        switch (value) {
            case 1:
                obj.addition();
                break;
            case 2:
                obj.multiplication();
                break;
            case 3:
                obj.substrasction();
                break;
            case 4:
                obj.division();
                break;
            default:
                System.out.println("Entered a wrong input");
                break;
        }
    }
}