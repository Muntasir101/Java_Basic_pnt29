package OOP;


public class Math3 extends Math1 {

    public static void main(String[] args) {
        summation();
        System.out.println("Hello " + name);

        Math2 obj2 = new Math2();
        obj2.multiplication();
        System.out.println("My Age: " + obj2.age);

        //obj2.division(500,50);
        //System.out.println(obj2.division(500,50));
        int division_result = obj2.division(100,20);
        System.out.println(division_result);

        int new_result = obj2.division(10,5) + 20;
        System.out.println(new_result);

    }
}


