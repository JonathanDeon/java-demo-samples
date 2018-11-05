package com.jonathan;

public class Printer {
		
		public <E> void printArray(E[] arr) {
			for(E e: arr) {
				System.out.println(e);
			}
			System.out.println();
		}
	
	
}
