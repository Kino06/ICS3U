import java.util.Scanner;
public class testn_project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continueInput; // 用户决定是否继续输入

        do {
            // 输入学生姓名
            System.out.print("请输入学生姓名: ");
            String name = scanner.next();

            // 输入三门课程的分数
            System.out.print("请输入第一门课程的分数: ");
            int score1 = scanner.nextInt();
            System.out.print("请输入第二门课程的分数: ");
            int score2 = scanner.nextInt();
            System.out.print("请输入第三门课程的分数: ");
            int score3 = scanner.nextInt();

            // 计算总分和平均分
            int total = score1 + score2 + score3;
            double average = total / 3.0;

            // 判断成绩等级
            String grade;
            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else if (average >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            // 输出结果
            System.out.println("\n学生姓名: " + name);
            System.out.println("总分: " + total);
            System.out.printf("平均分: %.2f\n", average);
            System.out.println("成绩等级: " + grade);

            // 是否继续输入
            System.out.print("\n是否继续输入数据？(y/n): ");
            continueInput = scanner.next().charAt(0);

        } while (continueInput == 'y' || continueInput == 'Y');

        System.out.println("程序结束，感谢使用！");


    }
}
