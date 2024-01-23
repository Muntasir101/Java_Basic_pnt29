package OOP;

public class Math2 {
    public static int age = 30;
    public void multiplication(){
        int number1= 100;
        int number2= 5;
        int result = number1 * number2;
        System.out.println(result);
    }
    public int division(int number1, int number2){
        //System.out.println(result);
        return number1 / number2;
    }

    public static void main(String[] args) {
        Math2 obj = new Math2();
        obj.multiplication();
        obj.division(20, 5);

    }
}
