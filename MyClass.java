import java.util.Scanner;

class MyClass extends Area{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Area obj = new Area();
        System.out.println("Enter Your choice");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
            obj.circle();    
                break;
            case 2:
            obj.square();    
                break;
            case 3:
            obj.rectangle();    
                break;
            case 4:
            obj.triangle();    
                break;    
            default:
                System.out.println("Entered a wrong input");
                break;
        }
    }
}