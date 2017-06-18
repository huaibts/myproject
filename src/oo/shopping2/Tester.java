package oo.shopping2;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list2 = new ArrayList<>();
		list2.add(new SilverCustomer(65000));
		list2.add(new NormalCustomer(5083));
		list2.add(new GoldenCustomer(8971));
		list2.add(new NormalCustomer(645));
		list2.add(new SilverCustomer(456123));
		
		for(Customer cust2 : list2){
			if(cust2 instanceof SilverCustomer && !(cust2 instanceof GoldenCustomer)){
				System.out.print("[銀]");
				SilverCustomer silver2 = (SilverCustomer)cust2;
			}else{
				if(cust2 instanceof GoldenCustomer){
					System.out.print("[金]");
				}else{
					System.out.print("[普]");
				}
			}
			cust2.print();
		}
		
	}

}
