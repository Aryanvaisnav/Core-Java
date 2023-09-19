package com.jsp.map;
import java.util.HashMap;
import java.util.TreeMap;
public class StudentMain {

	public static void main(String[] args) {
		Student S1 = new Student("Raj", 9978);
		Student S2 = new Student("Rahul", 6332);
		Student S3 = new Student("Pinky", 7211);
		Student S4 = new Student("Akshay", 5988);
		Student S5 = new Student("Ajay", 9978);
		
		HashMap<Student, String> studentList = new HashMap<>();
		studentList.put(S1, "A");
		studentList.put(S2, "B");
		studentList.put(S3, "C");
		studentList.put(S4, "D");
		studentList.put(S5, "E");
		
	//	for(Student S: studentList) {
	//		System.out.println(S);
	//	}
		
		TreeMap<Student, String> TS = new TreeMap<>();
		TS.put(S1, "A");
		TS.put(S2, "B");
		TS.put(S3, "C");
		TS.put(S4, "D");
		TS.put(S5, "E");
		
		// System.out.println(TS);
		
		for(Student S: TS.keySet()) {
			System.out.println(S);
			
		}
		
	}

}
