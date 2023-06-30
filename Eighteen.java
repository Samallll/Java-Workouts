import java.util.Scanner;

class Eighteen {
    static Scanner s;

    void grade(){
        System.out.println("\nEnter Written test mark");
        float written = s.nextFloat();
        System.out.println("\nEnter Lab exam mark");
        float lab = s.nextFloat();
        System.out.println("\nEnter Assignment mark");
        float Assignment= s.nextFloat();
        float result = (written*70)/100 + (lab*20)/100 + (Assignment*10)/100;
        System.out.println("\nGrade of the Student is "+result);
    }

    public static void main(String[] args) {
        Eighteen resultObj = new Eighteen();
        s =new Scanner(System.in);
        resultObj.grade();
    }
}