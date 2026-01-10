package OOPS.Inheritance.Challenge.ARRAYOPERATION;

public class Tester {
    public static void main(String[] args) {

        ArrayClass array=new ArrayClass(new int[]{1,2,3,4,9,1});

        array.printArray();
        System.out.println(array.mean());
        System.out.println(array.median());
    }
}
