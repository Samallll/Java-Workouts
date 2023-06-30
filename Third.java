import java.util.Scanner;

class Third{

    float simpleInrterest(){

    float si;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Principle Amount");
    int p = scan.nextInt();
    System.out.println("Enter Intrest Rate");
    float r=scan.nextFloat();
    System.out.println("Entere Number of Years");
    float n=scan.nextFloat();

    return si= (p*r*n)/100;


    }
    public static void main(String[] args) {
        Third obj = new Third();
        System.out.println("Simple Interest :" + obj.simpleInrterest());
}

}