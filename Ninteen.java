import java.util.Scanner;

class Ninteen {
    
    void taxCalculat(){
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter Your Annual Income: ");
        float income = scanObj.nextFloat();
        if (income <=250000) {
            System.out.println("No Tax");
        }
        else if((income>250000)&&(income<=500000)){
            System.out.println("Income tax amount = "+(income*5)/100);
        }
        else if((income>500000)&&(income<=1000000)){
            System.out.println("Income tax amount = "+(income*20)/100);
        }
        else if((income>1000000)&&(income<=5000000)) {
            System.out.println("Income tax amount is = "+income*30/100);
        } 
        else{
            System.out.println("Entered a wrong value");
        }
    }
    public static void main(String[] args) {
        Ninteen obj = new Ninteen();
        obj.taxCalculat();
    }
}