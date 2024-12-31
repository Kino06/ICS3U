import java.util.Formatter;
import java.util.Scanner;

public class assignment1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of the rows");
        Formatter formatter = new Formatter();
        int row = scanner.nextInt();
        int row1 = row/2 ;
        int i;

        for(i = 0;i <= row1;i += 1){
            String space = " ".repeat(row-i);
            String stars = "*".repeat(i*2+1);
            System.out.println(space + stars);
        }

        for(i=row1;i>=0;i-=1){
            String space = " ".repeat(row-i);
            String stars = "*".repeat(i*2+1);
            System.out.println(space + stars);
        }
    }
}
