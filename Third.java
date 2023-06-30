import java.util.Scanner;

class Third{

    static Scanner scan;

    float simpleInrterest(){

    System.out.println("Enter Principle Amount");
    int p = scan.nextInt();
    System.out.println("Enter Intrest Rate");
    float r=scan.nextFloat();
    System.out.println("Entere Number of Years");
    float n=scan.nextFloat();

    return (p*r*n)/100;


    }
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Third obj = new Third();
        System.out.println("Simple Interest :" + obj.simpleInrterest());
}

}