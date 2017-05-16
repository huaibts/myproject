package oo.shoping;

public class GoldenCustomer extends SilverCustomer{
	public GoldenCustomer(int price){
		this.price = price;
	} 
	@Override
	public void print(){
		System.out.println("金級客戶:");
		System.out.println("價錢:"+price+"\t"+"折扣後:"+(discount*price)+"\t"+"還元金:"+(returnRate*price));
	}
}
