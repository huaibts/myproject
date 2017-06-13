package oo.shopping2;

import java.util.ArrayList;

import oo.shoping.Customer;
import oo.shoping.GoldenCustomer;
import oo.shoping.SilverCustomer;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new GoldenCustomer(500));
		list.add(new SilverCustomer(65040));
		list.add(new Customer(63210));
		list.add(new GoldenCustomer(8054));
		for(Customer cust : list){
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer)){
				System.out.print("[銀]");
				SilverCustomer silver = (SilverCustomer)cust;
			}else{
				if(cust instanceof GoldenCustomer){
					System.out.print("[金]");
				}else{
					System.out.print("[普]");
				}
			}
			cust.print();
		}
	}

}
