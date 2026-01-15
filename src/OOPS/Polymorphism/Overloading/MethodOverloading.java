package OOPS.Polymorphism.Overloading;

public class MethodOverloading {

    MethodOverloading(double a,int b){
        System.out.println("hi");
    }

    public int add(int a,int b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public double add(double a,int b){
        return a+b;
    }

    public double add(int a,double b){
        return a+b;
    }

}
