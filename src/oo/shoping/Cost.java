package oo.shoping;

import java.util.ArrayList;
import java.util.Scanner;

import oo.shoping.Customer;

public class Cost {

	public static void main(String[] args) {
		// 有一商店，客戶分為一般客戶、銀級客戶、金級客戶三種。銀級客戶每次消費有九折折扣。金級客戶除銀級折扣外，每次消費還提供5%還元金		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(1000));
		list.add(new SilverCustomer(20000));
		list.add(new GoldenCustomer(5000));
		list.add(new SilverCustomer(53560));
		list.add(new Customer(7700));
		list.add(new GoldenCustomer(50080));
		list.add(new GoldenCustomer(25001));
		list.add(new SilverCustomer(5560));
		for(int i = 0;i < list.size();i++){
			//父類別的參照 可以放置 子類別的物件
			Customer cus = list.get(i);
			cus.print();
		}
	}

}
