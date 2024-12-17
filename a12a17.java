import java.util.Scanner;

public class a12a17 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a number to find the factorial");
        int b = a.nextInt();
        int i = b;
        int c = b;
        while(i>1){
            i-=1;
            c = c*i;
        }
        System.out.println(c);
    }
}
