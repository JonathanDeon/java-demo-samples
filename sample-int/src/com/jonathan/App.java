package com.jonathan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
	
		try {
			FileWriter fileWriter = new FileWriter("");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			FileReader fileReaders = new FileReader("");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		try {
			FileReader fileReader;

			fileReader = new FileReader("/home/user/example.txt");

			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				
				String capitalLine = "";
				Capitalize capitalize = new Capitalize();
				char[] characters = line.toCharArray();
			
				
				for(char c: characters) {
					capitalLine+=capitalize.capitalize(c);
				}
				System.out.println(capitalLine);
				
				
				
			}
			
		}catch(FileNotFoundException e) {
			
		}catch(Exception e) {
			
		}
		

	}

}
