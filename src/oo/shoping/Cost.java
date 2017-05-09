package oo.shoping;

import java.util.ArrayList;

import oo.shoping.Customer;

public class Cost {

	public static void main(String[] args) {
		// 有一商店，客戶分為一般客戶、銀級客戶、金級客戶三種。銀級客戶每次消費有九折折扣。金級客戶除銀級折扣外，每次消費還提供5%還元金
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(1000,900));
	}

}
