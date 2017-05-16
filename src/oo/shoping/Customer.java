package oo.shoping;

public class Customer {
	int price;
	float discount = 0.9f;
	float returnRate = 0.05f;
	Customer(){
		
	}
	public Customer(int price){
		this.price = price;
	} 
	public void print(){
		System.out.println("一般客戶:");
		System.out.println("價錢:"+price+"\t"+"折扣後:"+price+"\t"+"還元金:"+"0");
	}
	
}
