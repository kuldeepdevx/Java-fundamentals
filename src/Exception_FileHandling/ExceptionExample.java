package Exception_FileHandling;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first num:");
        int a=input.nextInt();
        System.out.print("Enter second num:");
        int b=input.nextInt();
        try{
            int result=a/b;
            System.out.println("result is "+result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Enter valid num for output");
        }catch(Exception e){
            System.out.println("Last exception");
        }
    }
}
