package sa;

interface Animal {
	void sound();
}

class Cat implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("cfdcdf");
	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		
		int c[] = new int[8];
		
		for(int i=0; i<4;i++) {
			c[2*i] = a[i];
			c[2*i+1] = b[i];
		}

//		for(int i : c) {
//			System.out.println(i);
//		}
		
		String name= reverseStr("Hello");
		
		System.out.println(name.substring(1));
		
		int n = 4569;
		//System.out.print(oddTot(1));

	}
	


	public static String reverseStr(String str) {
		if (str.length() == 0) {
			return str;
		}
		
		return reverseStr(str.substring(1)) + str.charAt(0);

	}
	
	static int reversed = 0;
	public static int reverseNum(int num) {
		if(num==0) {
			return reversed;
		}
		
		reversed = reversed*10 +num%10;
		num = num/10;
		
		return reverseNum(num);
		
	}
	
	static int tot=0;
	public static int oddTot(int a) {
		if(a>=10) {
			return tot;
		}
		tot = tot+a;
		return oddTot(a+2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
