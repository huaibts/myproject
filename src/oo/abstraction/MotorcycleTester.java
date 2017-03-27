package oo.abstraction;

public class MotorcycleTester {

	public static void main(String[] args) {
		Motorcycle m1 = new Motorcycle("Yamaha","Ray","white",106,125);
		Motorcycle m2 = new Motorcycle("Yamaha","FS","RED",94,115);
		Motorcycle m3 = new Motorcycle("SYM","Z1","BLUE",115,125);
		Motorcycle m4 = new Motorcycle("KYMCO","G6","BLACK",126,150);
		
//		int []n= new int[3];
//		System.out.println(n[1]);
		Motorcycle[] motor = new Motorcycle[4]; 
		motor[0]= new Motorcycle("Yamaha","Ray","white",106,125);
		motor[1]= new Motorcycle("Yamaha","FS","RED",94,115);
		motor[2]= new Motorcycle("SYM","Z1","BLUE",115,125);
		motor[3]= new Motorcycle("KYMCO","G6","BLACK",126,150);
		motor[0].id = 100;
		motor[1].id = 520;
		motor[2].id = 564;
		motor[3].id = 026;
		for(int i = 0;i<4;i++){
			System.out.print(motor[i].color+" ");
			System.out.print(motor[i].id+" ");
			System.out.print(motor[i].name);
			System.out.println();
		}
		
	}

}
