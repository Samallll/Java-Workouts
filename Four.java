import java.util.Scanner;

class Four {

    void examResult(){    

    Scanner scan = new Scanner(System.in);
    float mark=scan.nextFloat();
        if(mark<50){
            System.out.println("Failed");
        }
        else if((mark<=100) && (mark>=50)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Entered wrong Mark");
        }
    }

    public static void main(String[] args) {
        Four obj = new Four();
        obj.examResult();
    }
}