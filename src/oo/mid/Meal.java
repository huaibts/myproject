package oo.mid;

public class Meal {
	String drink;
	String 主餐;
	String 副餐;
	int price;
	String other;
	
	public Meal(String drink,String 主餐,String 副餐,String other,int price){
		this.drink = drink;
		this.主餐 = 主餐;
		this.副餐 = 副餐;
		this.other = other;
		this.price = price;
	}
	public void name(){
		System.out.println(主餐+"\t"+副餐+"\t"+drink+"\t"+other+"\t"+price+"dollar");
	
		
	}
/*	public void setDrink(String drink){
		this.drink = drink;
	}
	public String getDrink(){
		return drink;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}*/
}
