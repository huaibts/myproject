package oo.stati;

public class GraduateStudent extends Student{
	//                       extends:繼承(建構子不繼承)
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
}
