package com.jsp.collection.set;
import java.util.HashSet;
import java.util.TreeSet;
public class StudentMain {

	public static void main(String[] args) {
		Student S1 = new Student("Raj", 9978);
		Student S2 = new Student("Rahul", 6332);
		Student S3 = new Student("Pinky", 7211);
		Student S4 = new Student("Akshay", 5988);
		Student S5 = new Student("Ajay", 9978);
		
		HashSet<Student> studentList = new HashSet<>();
		studentList.add(S1);
		studentList.add(S2);
		studentList.add(S3);
		studentList.add(S4);
		studentList.add(S5);
		
	//	for(Student S: studentList) {
	//		System.out.println(S);
	//	}
		
		TreeSet<Student> TS = new TreeSet<>();
		TS.add(S1);
		TS.add(S2);
		TS.add(S3);
		TS.add(S4);
		TS.add(S5);
		
		for(Student S: TS) {
			System.out.println(S);
		}
		
	}

}
