package com.jsp.filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.*;

public class FileHandling {
	public static void main(String [] args) {
		File f = new File("C:\\Users\\Dell\\Desktop\\Demo.txt");
		try {
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.write("This is a java file...");
			fw.close();
		}
		catch(IOException I) {
			System.out.println(I.getMessage());
		}
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.next();
				System.out.print(data+" ");
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}