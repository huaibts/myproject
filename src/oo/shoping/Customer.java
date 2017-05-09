package oo.shoping;

public class Customer {
	int price;
	float discount = 0.1f;
	float returnRate = 0.05f;
	Customer(){
		
	}
	public Customer(int price,float discount){
		this.price = price;
		this.discount = discount;
	} 
	public void print(){
		System.out.println(price+"\t"+discount);
	}
	
}
