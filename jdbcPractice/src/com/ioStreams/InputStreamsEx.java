package com.ioStreams;

import java.io.FileInputStream;

public class InputStreamsEx {

	public static void main(String[] args) {
		try (FileInputStream fs=new FileInputStream("suma.txt")){
			int data;
			while((data=fs.read())!=-1) {
				System.out.println((char)data);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
