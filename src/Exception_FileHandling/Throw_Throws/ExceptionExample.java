package Exception_FileHandling.Throw_Throws;

public class ExceptionExample {

    public void findClass(String name) throws ClassNotFoundException{
        Class.forName(name);
        System.out.println("Class successfully find");
    }
}
