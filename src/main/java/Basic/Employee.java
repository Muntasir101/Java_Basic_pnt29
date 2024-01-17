package Basic;

public class Employee {

    // salary  variable is a private static variable
    private static double salary;

    // constructor
    public Employee(){
        salary = 1000;
    }

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        Employee dhaka = new Employee();
        System.out.println(dhaka.salary); // 1000

        method1();
        method2();

    }
    private static void method1(){
        salary = 2000;
        System.out.println(DEPARTMENT + "average salary:" + (int)salary); // 2000
    }
    private static void method2(){
        salary = 500;
        System.out.println(DEPARTMENT + "average salary:" + salary); //500
    }
}