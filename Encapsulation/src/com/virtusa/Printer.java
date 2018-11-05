package com.virtusa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {

	
	public void write() throws IOException {
		FileWriter fileWriter = new FileWriter("/home/user/example.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		for(int i=0;i<10;i++) {
			bufferedWriter.write("# "+i+"\n");
		}
		
		bufferedWriter.close();   
		
	}
	
	public void read() throws IOException {
		String line;
		FileReader fileReader = new FileReader("/home/user/example.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
		}
		bufferedReader.close();
	}
}
