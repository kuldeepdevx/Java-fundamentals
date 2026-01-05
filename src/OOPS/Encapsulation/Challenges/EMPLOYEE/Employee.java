package OOPS.Encapsulation.Challenges.EMPLOYEE;

public class Employee {
    private static int totalEmployees;

    private String name;
    private double age;
    private double salary;

    public Employee(String name,double salary,double age){
        if( !isValidName(name) ||
            !isValidAge(age) || !isValidSalary(salary)){
            System.out.println("Invalid employee details.");
            return;
        }
            this.name = name;
            this.age = age;
            this.salary = salary;
            totalEmployees++;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
       if(!isValidName(name)){
           return;
       }
        this.name=name;
    }


    public double getAge(){
        return age;
    }

    public void setAge(double age) {
        if(!isValidAge(age)){
            System.out.println("Age is not eligible.");
            return;
        }
        this.age = age;
    }


    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(!isValidSalary(salary)){
            System.out.println("Invalid salary amount.");
            return;
        }
        this.salary=salary;
    }

    public String seeEmployeeDetails(){
        return "Employee Details["+
                "Name="+name+",Age="+age+
                ",Salary="+salary+"]\n";
    }

    private static boolean isValidName(String name){
        return name!=null && !name.trim().isEmpty();
    }
    private static boolean isValidAge(double age){
        return age>=18 && age<=56;
    }

    private static  boolean isValidSalary(double salary){
        return salary>0;
    }
}
