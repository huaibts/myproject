package oo.shopping2;

public class SilverCustomer extends Customer{

	public SilverCustomer(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("價錢:"+price+"\t"+"折扣後:"+discount*price+"\t"+"還元金:"+"0");
		
	}

}
