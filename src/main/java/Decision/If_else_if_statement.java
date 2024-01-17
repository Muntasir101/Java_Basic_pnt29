package Decision;

public class If_else_if_statement {
    public static void main(String[] args) {
        int my_marks = 101;
        int pass_marks = 34;

        System.out.println("Hello from Department");

        // nested if-else statement
        if (my_marks>=pass_marks) {
            if (my_marks>=40 && my_marks <=49){
                System.out.println("Successfully passed");
                System.out.println("Grade D");
            }
            else if (my_marks>=50 && my_marks <=59) {
                System.out.println("Successfully passed");
                System.out.println("Grade C");
            }
            else if (my_marks>=60 && my_marks <=69) {
                System.out.println("Successfully passed");
                System.out.println("Grade B");
            }
            else if (my_marks>=70 && my_marks <=79) {
                System.out.println("Successfully passed");
                System.out.println("Grade A-");
            }
            else if (my_marks>=80 && my_marks <= 90) {
                System.out.println("Successfully passed");
                System.out.println("Grade A");
            }
            else if (my_marks>=90 && my_marks<=100) {
                System.out.println("Successfully passed");
                System.out.println("Grade A+");
            }
            else{
                System.out.println("Invalid marks");
            }
        }

        else {
            System.out.println("Failure");
        }

        System.out.println("Thanks for your Result");

    }
}
