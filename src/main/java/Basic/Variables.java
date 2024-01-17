package Basic;

public class Variables {
    // instance variables
    public static String name = "John";

    public static void main(String[] args) {
        method1();
    }
    // local variables
    public static void method1(){
        //a and b are local variables
        byte d = 1; // 8-bit  -128  to 127
        short b = 32; // 16-bit
        int a = 10; // 32-bit
        long c = 20;  // 64-bit

        float tax = 10.4f;
        double salary = 10000.2000;

        char address = 'a';

        boolean status = true;

        int age = 5;
        age = age + a;
        System.out.println("Puppy age is : " + age);
        System.out.println("My name is : " + name);

        // Define int variables
        int num1 = 5004;
        double num2 = 2.5;
        int sum = (int) (num1 + num2);
        System.out.println(sum);
    }
}
