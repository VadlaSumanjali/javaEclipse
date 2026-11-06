package com.ioStreams;

import java.io.File;
import java.io.IOException;

public class CheckFileExsist {

	public static void main(String[] args) throws IOException {
		File file = new File("employee.txt");
		
//		if(file.delete()) {
//			System.out.println("file deleted");
//		}else {
//			System.out.println("unable to delete");
//		}
		
		if(file.createNewFile()) {
			System.out.println("file exixte");
		}else {
			System.out.println(" exist already");
		}
		if(file.exists()) {
			System.out.println("file exist");
		}else{
			System.out.println("not");
			
		}

	}

}
