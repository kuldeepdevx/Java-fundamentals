package Exception_FileHandling;

public class Exception {
    public static void main(String[] args){

        int y=5/0;

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Always executed");
        }

    }
}
