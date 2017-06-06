package oo.shopping2;

public class NormalCustomer extends Customer{

	public NormalCustomer(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("一般客戶:");
		System.out.println("價錢:"+price+"\t"+"折扣後:"+price+"\t"+"還元金:"+"0");
		
	}

}
