import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int score1, score2, score3;
    int total;
    double average;
    String grade;

    // 构造方法
    public Student(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.total = score1 + score2 + score3;
        this.average = total / 3.0;
        this.grade = calculateGrade(this.average);
    }

    // 计算成绩等级
    private String calculateGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    // 格式化输出学生信息
    public String toString() {
        return String.format(
                "%s %s\n%5s%-15s %d\n%5s%-15s %.2f\n%5s%-15s %s\n",
                "Student:", name,
                "", "Total Score:", total,
                "", "Average Score:", average,
                "", "Grade:", grade
        );
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(); // 用于存储学生信息
        char continueInput;
        System.out.println("Welcome you to use Student Grading System!"+"\n");
        // 循环输入学生信息
        do {
            System.out.print("Please enter the name of the student: ");
            String name = scanner.next();
            System.out.print("Please enter the score for the first course: ");
            int score1 = scanner.nextInt();
            System.out.print("Please enter the score for the second course: ");
            int score2 = scanner.nextInt();
            System.out.print("Please enter the score for the third course: ");
            int score3 = scanner.nextInt();

            // 创建学生对象并加入列表
            Student student = new Student(name, score1, score2, score3);
            students.add(student);

            System.out.print("\nDo you still want to enter more information？(y/n): "+"\n");
            continueInput = scanner.next().charAt(0);

        } while (continueInput == 'y' || continueInput == 'Y');

        // 停止输入后，询问用户如何操作
        char displayChoice;
        do {
            System.out.println("\nWhat operation you want to do？");
            System.out.println("1. View all student information");
            System.out.println("2. View specific student information");
            System.out.println("3. Quit the program");
            System.out.print("Please make a choice(1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // 显示所有学生信息
                    System.out.println("\nAll the student information is here：");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    // 查看特定学生信息
                    System.out.print("\nPlease enter the name of the student you want to learn about: ");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.name.equals(searchName)) {
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student " + searchName + " is not in the system.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using Student Grading System! Hope you have a nice day!");
                    displayChoice = 'n';
                    return;
                default:
                    System.out.println("Invalid selection, please re-enter！");
            }

            System.out.print("\nDo you still want to do more operation？(y/n): ");
            displayChoice = scanner.next().charAt(0);

        } while (displayChoice == 'y' || displayChoice == 'Y');

        System.out.println("Thank you for using Student Grading System! Hope you have a nice day!");
        scanner.close();
    }
}
