package com.assignment;

public class Table {

	public static void main(String[] args) {
		
		System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("--------------------------------------------------------------------------------------");
		
		for(int i=1;i<10;i++) {
			System.out.print(i+"\t|\t");
			for(int k=1;k<10;k++) {
				System.out.print(k*i+"\t");
			}
			System.out.println();
		}

	}

}
