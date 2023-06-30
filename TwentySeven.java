import java.util.Scanner;

class TwentySeven {
    public static void main(String[] args) {
        try{
            int my_height;
            Scanner s = new Scanner(System.in);
            my_height=s.nextInt();
            if (Double.isNaN(my_height)) {
                throw new Exception("notANumberError");
            }
            if (my_height>76) {
                throw new Exception("HugeHeightError");
            }
            if((my_height<=76)&&(my_height>=30))
            {
                throw new Exception("TinyHeightError");
            }
            System.out.println(my_height);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}