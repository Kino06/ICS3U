import java.util.Scanner;

public class testa {
    public static void main(String[] args) {
        double price = 123456.1232;
        int price1 =1;
        String grade = "a";
        System.out.println(String.format(
                "%5s%-15s %s\n%5s%-15s %d\n%5s%-15s %.2f\n%5s%-15s %s",
                "", "Student's name:", "name",
                "", "Total Score:", price1,
                "", "Average Score:", price,
                "", "Grade:", grade
        ));
    }

}
