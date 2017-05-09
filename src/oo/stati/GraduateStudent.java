package oo.stati;

public class GraduateStudent extends Student{
	//                       extends:繼承  (建構子不繼承)
	//所有類別的最上層父類別是java.lang.Object
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	@Override//幫助檢查覆蓋方法的錯誤
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thesis);
	}
}
