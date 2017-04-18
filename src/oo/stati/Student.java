package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	
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
