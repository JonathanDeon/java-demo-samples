package com.assignment;

public class Diamond {

	public static void main(String[] args) {
		
//		int number = 10;
//		int count = 1;
//		for(int i=1;i<=2*number-1;i++) {
//			
//			for(int k=count;k<=number;k++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1;j<=count*2-1;j++) {
//				System.out.print("*");
//			}
//			if(i<number) {
//				count++;
//				System.out.println("");	
//			}
//			else {
//				count--;
//				System.out.println("");
//			}
//			
//		}
		
		int c=1;
		
		for(int i=1;i<=9;i++) {	
			for(int k=c;k<=5;k++) {
					System.out.print("0");
			}
			
			for(int j=1;j<=c*2-1;j++) {
				System.out.print("1");
				
				
			}
			
			if(i<9) {
			c++;
			System.out.println("");	
		}
		else {
			c--;
			System.out.println("");
		}

		
	
		}

	}

}