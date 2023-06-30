import java.util.Scanner;

public class Second {

    float sum(){
        System.out.println("Enter two numbers");
        Scanner obj = new Scanner(System.in);
        int value1 = obj.nextInt();
        float value2 = obj.nextFloat();
        return value1+value2;
    }
    

    public static void main(String[] args) {

        Second sumObj = new Second();
        System.out.println("Result is :"+sumObj.sum());
        
    }
}