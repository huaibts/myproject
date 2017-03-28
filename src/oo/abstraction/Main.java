package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		Car c = new Car("abc","asd",1200);
		c.setMilage(10000);
		
		float current = c.addMilage(95);
		System.out.println("目前里程數:"+current);
		
	}

}
