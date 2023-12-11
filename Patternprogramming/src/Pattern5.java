
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the char wgich should to be printed");
        char ch = scanner.next().charAt(0);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

      
    }
}


