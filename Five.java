import java.util.Scanner;

class Five {
    void grade(){
        Scanner obj = new Scanner(System.in);
        int mark = obj.nextInt();
            if( mark<50 ){
                System.out.println("Failed");
            }
            else if(( mark<60 ) && (mark >= 50)){
                System.out.println("Grade is : E");
            }
            else if(( mark<70 ) && (mark >= 60)){
                System.out.println("Grade is : D");
            }
            else if(( mark<80 ) && (mark >= 70)){
                System.out.println("Grade is : C");
            }
            else if(( mark<90 ) && (mark >= 80)){
                System.out.println("Grade is : B");
            }
            else if(( mark<100 ) && (mark >= 90)){
                System.out.println("Grade is : A");
            }
            else{
                System.out.println("Entered wrong mark");
            }
    }

    public static void main(String[] args) {
        Five valObj = new Five();
        valObj.grade();

}

}