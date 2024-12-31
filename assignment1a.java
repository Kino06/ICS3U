import java.util.Scanner;
public class assignment1a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome you to use Student Grading System!"+"\n");

        System.out.print("Please enter the name of the student: ");
        String name = scanner.next();
        System.out.print("Please enter the score for the first course: ");
        int score1 = scanner.nextInt();
        System.out.print("Please enter the score for the second course: ");
        int score2 = scanner.nextInt();
        System.out.print("Please enter the score for the third course: ");
        int score3 = scanner.nextInt();

        int total = score1 + score2 + score3;
        double average = total / 3.0;
        String grade;

        if (average >= 90) {
            grade = "A";
        }else if (average >= 80) {
            grade = "B";
        }
        else if (average >= 70){
            grade = "C";
        }
        else if (average >= 60){
            grade = "D";
        } else{
            grade = "F";
        }

        System.out.println(String.format("\n%s %s\n%5s%-15s %d\n%5s%-15s %.2f\n%5s%-15s %s\n",
                "Student:", name,
                "", "Total Score:", total,
                "", "Average Score:", average,
                "", "Grade:", grade));
    }
}
