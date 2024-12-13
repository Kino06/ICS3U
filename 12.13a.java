import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the range (1 to N): ");
        int N = a.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenCount+=1;
            } else {
                oddCount+=1;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
