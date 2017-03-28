package oo.abstraction;

public class Car {
	String brand;
	int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;
	
	public Car(String brand,String name,int cc){
		this.brand = brand;
		this.cc = cc;
		this.name = name;
//		this.type = type;
	}
	
	//          第一詞:小寫;第二詞以後第一字大寫(ex:setMilage)
	public void setMilage(int m){
		milage = m;
	}
	
	public float addMilage(int m){
		milage = milage + m;
		return milage;
		//return void:空(沒東西)
	}
	
	//方法
//  ReturnType :public,... ; MethodName :(ex:)maintain,... ; void:參數值	
	public void maintain(){
		status = 5;
	}
	
	
}
