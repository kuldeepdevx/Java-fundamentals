package Exception_FileHandling.Excetpionstack;
import java.util.Scanner;

public class ExceptionStack {
    public static void main(String[] args){
        A();
    }

    public static void A(){
        B();
    }

    public static void B(){
        C();
    }

    public static void C(){
        D();
    }

    public static void D(){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first num:");
        int first=input.nextInt();
        System.out.print("Enter second num:");
        int second=input.nextInt();

        int result = first / second;

        System.out.println("Result is "+result);
    }
}
