import java.util.Scanner;

public class Pattern5hole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the char wgich should to be printed");
        char ch = scanner.next().charAt(0);

        for (int i =1; i<=n ; i++)
        {
            for (int j = 1; j <=i; j++)
            {   
           
            	if (j==1 || i==n || j%i==0)
            	{
                System.out.print(ch);
            }
            	else
            	{
            		System.out.print(" ");
            	}
            }
            System.out.println();
        }
    }
}
            

