package oo.mid;

public class Ticket {
	int id;
	String name;
	String price;
	
	public void setId(int id){
		this.id = id;
		//set-->void
	}
	public int getId(){
		return id;
		//get-->return
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getPrice(){
		return price;
	}
	/*public void setId(int a){
		id = a;
	}
	public void setName(String b){
		name = b;
	}
	public void setPrice(String c){
		price = c;
	}
	public void getId(int d){
		id+=d;
	}
	public void getName(String e){
		name +=e;
	}
	public void getPrice(String f){
		price+=f;
	}*/
	
}
