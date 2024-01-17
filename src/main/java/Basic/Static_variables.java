package Basic;

public class Static_variables {
    static int count = 2;

    public Static_variables(){
        //count++;
        count = count + 1;
    }

    public static void main(String[] args) {
        Static_variables obj = new Static_variables();
        System.out.println("Count:" + obj.count); // 3

        Static_variables obj2 = new Static_variables();
        System.out.println("Count:" + obj2.count); // 4
    }
}
