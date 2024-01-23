package OOP;

public class Student{
    // properties/variables
    static String name ;
    static int mark1 ;
    static int mark2 ;
    static int mark3;
    static int total;
    static float average;

    public Student(String name, String mark1, String mark2, String mark3) {
        Student.name =name;
        Student.mark1 = Integer.parseInt(mark1);
        Student.mark2 = Integer.parseInt(mark2);
        Student.mark3 = Integer.parseInt(mark3);
    }

    //state
    void total() {
        total = mark1+mark2+mark3;
        System.out.println("Total:"+total);
    }
    //state
    void average() {
        average = (float) total / 3;
        System.out.println("Average:"+average);
    }

    void student_name() {
        System.out.println(name);
    }


    public static void main(String[] args) {
        //creating an object using new keyword
        Student student1 = new Student("john","50","80","95");
        //invoking method using the object
        student1.student_name();
        student1.total();
        student1.average();

        // Another student object
        Student student2 = new Student("Anu","55","85","65");
        //invoking method using the object
        student2.student_name();
        student2.total();
        student2.average();

    }
}

