import java.util.Scanner;

class Thirteen {
    public static void main(String[] args) {
        String rev="";
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanObj.nextLine();
        int length = str.length();

        for (int i = length-1; i >=0 ; i--) {
            rev=rev+str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Entered string is a palindrome");
        }else{
            System.out.println("Entered string is not a palindrome");
        }
    }
}