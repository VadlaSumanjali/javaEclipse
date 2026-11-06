package com.ioStreams;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("data.txt");
			fw.write("sumaa btech");
			System.out.println("data was entered ");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
