package com.virtusa;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application {

	public static void main(String[] args) throws IOException {
		
//		RoseGarden roseGarden = new RoseGarden();
//		roseGarden.addRose("red", "Lovers Rose");
//		roseGarden.addRose("pink", "Rose");
//		roseGarden.addRose("white", "Frienship Rose");
//		
//		roseGarden.getRoses();
//		ArrayList<Rose> roses =  new RoseGarden("Frienship Rose","White",3).roses;
//
//		
//		for(Rose rose :roses) {
//			System.out.println(rose.toString());
//		}
		
//		Printer printer = new Printer();
//		printer.write();
//		printer.read();
		
//		for(int i=5;i>=0;i--) {
//			for(int k=i;k<4;k++) {
//				System.out.print("0");
//			}
//			System.out.println("*");
//		}
		
		
		Deque<Integer> s = new ArrayDeque<>();
		s.push(45);
		s.push(0);
		s.push(78);
		s.push(55);
		
//		for(Integer o:s) {
//			System.out.println(o);
//		}
		
		List<Integer> q = new LinkedList<>();
		q.add(45);
		q.add(88);
		q.add(1, 5);
		
		for(Integer c:q) {
			System.out.println(c);
		}
	
		System.out.println();
		
		
		
				

	}

}