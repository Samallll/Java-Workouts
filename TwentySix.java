public class TwentySix {
    public static void main(String[] args) {
        String my_string = "1234";
        try {
            StringBuilder reversed_string = new StringBuilder(my_string).reverse();
            System.out.println("Reversed string is: " + reversed_string);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Type of my_string is: " + my_string.getClass().getSimpleName());
        }

    }
}