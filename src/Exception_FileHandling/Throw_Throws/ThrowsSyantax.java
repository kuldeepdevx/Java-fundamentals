package Exception_FileHandling.Throw_Throws;

public class ThrowsSyantax {

    public static void printName(String name)
            throws IllegalArgumentException{
        if(name.contains("-")) {
           throw new IllegalArgumentException("Illegal Argument");
        }else{
            System.out.println("Name is "+name);
        }
    }
}
