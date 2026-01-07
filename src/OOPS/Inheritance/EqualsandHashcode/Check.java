package OOPS.Inheritance.EqualsandHashcode;

public class Check {
    public static void main(String[] args) {
        Person person1=new Person(19,"EC2151","Kuldeep");
        Person person2=new Person(19,"EC2151","Kuldeep");

        System.out.println(person1.equals(person2));

        StringBuilder str=new StringBuilder("Kuldeep");
        System.out.println(str.toString());
    }
}
