package OOPS.Encapsulation.Challenges.EMPLOYEE;

public class EmployeeDetails {
    public static void main(String[] args) {

        Employee employee1=new Employee("Kuldeep",50000,20);
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.seeEmployeeDetails());


        Employee employee2=new Employee("Kuldeep",1000, 25);
        employee2.setAge(10);
        employee1.setName("  ");
        employee2.setSalary(-1000);

        Employee employee3=new Employee("Kuldeep",-1000, 10);

        System.out.println(Employee.getTotalEmployees());
    }
}
