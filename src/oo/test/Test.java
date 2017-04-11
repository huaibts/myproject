package oo.test;

//Import:加入不同package的class
import oo.abstraction.Car;
					//Car或*	
import java.util.ArrayList;
				//ArrayList或*
public class Test {
	

	public static void main(String[] args) {
		Car c = new Car("Toyota", "asd", 2000);
		ArrayList<String> a = new ArrayList();
		//<>:置於類別後，只接受<>內的型態
		a.add("123");
		a.add("456");
//		a.add(226);
		a.add("897");
//		a.add(true);
		System.out.println(a.size());
		//add:增加 ; size:個數 ; set:改變(第幾個, 第幾個改成這個); get:
		a.add("582");
		a.add("963");
		System.out.println(a.size());
		a.set(1, "766");
		//順序[0,1,2,3,4,...]
		System.out.println(a);
		String data = a.get(3);
//		int n = (int)a.get(4);
		
		
		/*本次開獎號為
		 331
		 821
		 886
		 554
		 讓使用者輸入發票好號碼(長度不限)
		 判斷尾數三位是否中獎
		 */
		
	}

}
