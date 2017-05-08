package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(55, 89, 66);
		Student stu3 = new Student(65, 79, 56);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		
//		System.out.println(Student.pass);
		GraduateStudent gstu1 = new GraduateStudent(66, 87, 66);
		GraduateStudent gstu2 = new GraduateStudent(78, 89, 60);
		gstu1.print();
		gstu2.print();
		System.out.println();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 98, 66));
		list.add(new Student(55, 89, 66));
		list.add(new Student(65, 79, 56));
		list.add(new GraduateStudent(66, 87, 66));
		list.add(new GraduateStudent(78, 89, 60));
		for(int i = 0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
		
		
	}

}
