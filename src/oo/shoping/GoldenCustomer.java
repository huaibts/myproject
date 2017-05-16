package oo.shoping;

public class GoldenCustomer extends SilverCustomer{
	public GoldenCustomer(int price){
		super(price);
	} 
	@Override
	public void print(){
		System.out.println("價錢:"+price+"\t"+"折扣後:"+(discount*price)+"\t"+"還元金:"+(returnRate*price));
	}
}
