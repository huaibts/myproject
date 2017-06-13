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
	}

}
