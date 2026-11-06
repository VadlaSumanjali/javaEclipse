package com.ioStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read {

	public static void main(String[] args) throws Exception {
		try {
//			BufferedReader bf=new BufferedReader(new FileReader("data.txt"));
//			String line;
//			while((line=bf.readLine())!=null) {
//				System.out.println(line);
//			}
			FileReader fr=new FileReader("data.txt");
			int data;
			while((data=fr.read())!=-1) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
