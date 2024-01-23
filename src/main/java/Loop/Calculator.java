package Loop;
import OOP.*;

public class Calculator {
    public static void main(String[] args) {
        Math1.summation();
        Math1.subtraction();

        Math2 obj = new Math2();
        obj.multiplication();
        obj.division(20, 5);

    }
}
