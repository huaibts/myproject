package oo.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		String s = "331";
		//----------0123456789
		String n = "2567897331";
		System.out.println(n.length());
		String sub = n.substring(n.length()-3);
//								 n.length()-n = 取後n個字
//								 n.length(7)=n.length(要取的第一字(直接取到最後))
//								 n.length(要取的第一字,要取的字後一字)		
		System.out.println(sub);
		
		ArrayList<String> b = new ArrayList();
		b.add("331");
		b.add("821");
		b.add("886");
		b.add("554");
		System.out.println("請輸入發票號碼:");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		

	}

}
