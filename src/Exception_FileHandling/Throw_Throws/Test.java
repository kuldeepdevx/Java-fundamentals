package Exception_FileHandling.Throw_Throws;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        ExceptionExample using=new ExceptionExample();
        try {
            using.findClass(input.next());
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
    }
}
