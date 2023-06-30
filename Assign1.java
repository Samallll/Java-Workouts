import java.util.Scanner;

class Assign1{
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the character");

        char name = obj.next().charAt(0);

        System.out.println("Your Name is\n"+name);  
    }


}