package com.ioStreams;

import java.io.FileOutputStream; 
import java.io.FileWriter;

public class OutputCreate {

	public static void main(String[] args) {
		try (FileWriter fw=new FileWriter("suma2.txt")){
//			String message="hello";
			fw.write("welcome to java i/o");
			
			System.out.println("file created");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

} 
