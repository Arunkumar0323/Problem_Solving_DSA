package com.CSE2027.day1;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class FileHandling {
	public static void main(String[] args) {
		
		try {
			File f1 = new File("C:\\Users\\arun1\\Downloads\\report (4).json");
			FileWriter Writer = new FileWriter(f1);
			Writer.write("Hello");
			Writer.close();
			Scanner input = new Scanner(f1);
			
			while(input.hasNextLine()) {
				String data = input.nextLine();
				System.out.println(data);
			}
			
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
