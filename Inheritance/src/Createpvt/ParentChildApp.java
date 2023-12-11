package Createpvt;

public class ParentChildApp {

	public static void main(String [] args)
	{
		Child c=new Child();
		System.out.println(c.x);
		System.out.println(c.y);
		c.dispx();
		c.dispy();
	}
}
