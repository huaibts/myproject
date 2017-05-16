package oo.shoping;

public class SilverCustomer extends Customer{
	SilverCustomer(){
		
	}
	public SilverCustomer(int price){
		this.price = price;
	} 
	@Override
	public void print(){
		System.out.println("銀級客戶:");
		System.out.println("價錢:"+price+"\t"+"折扣後:"+discount*price+"\t"+"還元金:"+"0");
	}
}
