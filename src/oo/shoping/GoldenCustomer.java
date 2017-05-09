package oo.shoping;

public class GoldenCustomer extends SilverCustomer{
	float discount = 0.1f;
	float returnRate = 0.05f;
	public GoldenCustomer(int price,float discount,float returnRate){
		this.price = price;
		this.discount = discount;
		this.returnRate = returnRate;
	} 
	@Override
	public void print(){
		System.out.println(price+"\t"+discount+"\t"+returnRate);
	}
}
