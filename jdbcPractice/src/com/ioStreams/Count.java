package com.ioStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Count {

	public static void main(String[] args)  throws Exception{
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			FileWriter fw=new FileWriter("des.txt");
			String line;
			while((line=br.readLine())!=null) {
				fw.write(line);
				fw.write("\n");
			}
			System.out.println("file ws w riten");
			br.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
