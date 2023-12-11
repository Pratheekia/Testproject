package ArrsyList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList all =new ArrayList();
		all.add(10);
		all.add(20);
		all.add("mango");
		all.add(55.5);
		all.add(true);
		System.out.println(all); //[10, 20, mango, 55.5, true]
		all.add(2,99);//adding elements with the help of index
		all.set(5, false);     //set helps to replace the old value by new value with help of index
		System.out.println(all); //[10, 20, 99, mango, 55.5, false]

	}

}
