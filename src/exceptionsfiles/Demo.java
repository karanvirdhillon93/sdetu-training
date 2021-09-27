package exceptionsfiles;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Progam starts");
		doMath(12,4);
		System.out.println("Progam continues");
		
		Scanner in = new Scanner(System.in);
		double payment;
		System.out.println(payment);
		payment = in.nextDouble();
		
	}
	
	public static void doMath(int a, int b) {
		answer(a,b);
		
	}
	
	public static double answer(int x, int y) {
		return x/y;
	}

}
