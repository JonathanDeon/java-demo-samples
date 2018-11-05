package com.jonathan;

public class Account<T> {
	
	T t;
	
	public Account(T t) {
		this.t = t;
	}
	
	public void showRate() {
		System.out.println(t.toString());
	}
	

}
