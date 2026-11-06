package com.ioStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException  {
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			int count=0;
			String line;
			while((line=br.readLine())!=null) {
				count+=line.length();
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
