package oo.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		String s = "331";
		//----------0123456789
		String n = "2567897331";
//		System.out.println(n.length());
		String sub = n.substring(n.length()-3);
//								 n.length()-n = 取後n個字
//								 n.length(x)=n.length(要取的第x字(直接取到最後))
//								 n.length(要取的第一字,要取的字後一字)		
//		System.out.println(sub);
		
		ArrayList<String> b = new ArrayList();
		b.add("331");
		b.add("821");
		b.add("886");
		b.add("554");
		System.out.println("請輸入發票號碼:");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		System.out.println(num);
		String c = num.substring(num.length()-3);
		String data = b.get(0);
		String data1 = b.get(1);
		String data2 = b.get(2);
		String data3 = b.get(3);
		
		if(c.equals(data)||c.equals(data1)||c.equals(data2)||c.equals(data3)){
			System.out.println("You won the prize!!");
		}else{
			System.out.println("Sorry. You can try another number.");
		}
		

	}

}
