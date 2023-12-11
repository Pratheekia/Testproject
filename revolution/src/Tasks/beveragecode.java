package Tasks;

import java.util.Scanner;

public class beveragecode {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the code");
        String code =scan.nextLine();
		
		if(code=="poo")
		{
			System.out.println("coke");
		}
		else if(code=="p02")
		{
			System.out.println("pepsi");
		}
		else if(code=="p03")
		{
			System.out.println("sprite");
		}
		else
		{
			System.out.println("not our beverage");
		}


	}

}
