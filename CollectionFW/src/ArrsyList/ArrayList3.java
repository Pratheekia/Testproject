package ArrsyList;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList al1 =new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add("mango");
		al1.add(55.5);
		al1.add(true);
		System.out.println(al1); //[10, 20, mango, 55.5, true]
		ArrayList al2 =new ArrayList();
		al2.add(30);
		al2.add(400);
		al2.add("apple");
		System.out.println(al2); //[30, 400, apple]
		ArrayList al3 =new ArrayList();
		al3.addAll(al1);
		al3.add(3,al2);
		System.out.println(al3); //[10, 20, mango, [30, 400, apple], 55.5, true]

	}

}
