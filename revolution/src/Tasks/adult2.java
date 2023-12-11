package Tasks;

import java.util.Scanner;

public class adult2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num");
        int age =scan.nextInt();
		if(age>0 && age<=12)
		{
			System.out.println("child");
		}
		else if(age>12 && age<20)
		{
			System.out.println("teen");
		}
		else if(age>=20 && age<=59)
		{
			System.out.println("teen");
		}
		else
		{
			System.out.println("senior citizen");
		}
	}

}
