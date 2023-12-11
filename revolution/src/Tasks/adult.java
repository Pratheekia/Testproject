package Tasks;

import java.util.Scanner;

public class adult {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num");
        int age =scan.nextInt();
		if(age>21)
		{
			System.out.println("adult");
		}
		else
		{
			System.out.println("child");
		}

	}

}
