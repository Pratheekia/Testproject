import java.util.Scanner;
 public class Factorialnum {
 public static void main (String [] args)
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the factorial");
	 int n = scan.nextInt();
	  int fact=1; //fact is just a variable we can give any variable
	  for(int i =1;i<=n;i++)
	  {
		  fact=fact*i;
	  }
	  System.out.println(fact);
	  }
 }
