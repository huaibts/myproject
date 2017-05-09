package oo.shoping;

public class SilverCustomer extends Customer{
	float discount = 0.1f;
	SilverCustomer(){
		
	}
	public SilverCustomer(int price,float discount){
		this.price = price;
		this.discount = discount;
	} 
	@Override
	public void print(){
		System.out.println(price+"\t"+discount);
	}
}
