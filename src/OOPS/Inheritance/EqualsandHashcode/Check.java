package OOPS.Inheritance.EqualsandHashcode;

public class Check {
    public static void main(String[] args) {
        Person person1=new Person(20,"EC2151","Kuldeep");

        Person person2=new Person(20,"EC2151","Kuldeep");

        Person person3=new Person(21,"EC2152","John");

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

    }
}
