package oo.stati;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(55, 89, 66);
		Student stu2 = new Student(65, 79, 56);
		stu1.pass = 70;
		stu1.print();
		stu2.print();

	}

}
