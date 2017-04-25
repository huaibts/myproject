package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	
	static{
		System.out.println("staticccc");
		System.out.println(pass);
	/*  有static的屬性或是在static方法區塊不能用this
		在static的方法裡不能用class裡的屬性跟this  */
	//	System.out.println(english);
	}
	
	public Student(){
		
	}
	/*自動產生建構子屬性
	右鍵>>source>>Generate Constructor using fields 
		public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	*/

	/*
	 static 類別變數 (靜態、全域變數Gobal variable)
	 關鍵字:不能當方法(package)名稱   ex:static,public
	有static的屬性或是在static方法區塊不能用this
	在static的方法裡不能用class裡的屬性
	 
	 屬性(Fields,Instance Variable實例變數)
	 ex:int math,int english....
	*/
	
	public Student(int english,int math,int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese));
	}
	
	private String getScore(int score){
		if(score < pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}
	
}
