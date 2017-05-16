package oo.shoping;

import java.util.ArrayList;

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
//		for(int i = 0;i < list.size();i++){
			//父類別(super、base)的參照 可以放置 子類別(sub、derived )的物件
//			Customer cust = list.get(i);
		for(Customer cust : list){
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer)){
				System.out.print("[銀]");
				SilverCustomer silver = (SilverCustomer)cust;
			}else{
				if(cust instanceof GoldenCustomer){
					System.out.print("[金]");
				}
			}
			cust.print();
		}
		String[] array = {"aa","bb","cc"};
		for(String s :array){
			//foreach迴圈
			System.out.println(s);
		}
	}

}
