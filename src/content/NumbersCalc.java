package content;

public class NumbersCalc {
	
	public static void main(String[] args) { 
		System.out.println("System is starting");
		printName();
		int num=5,numb=10;
		addNumbers(num,numb);
		int product=multiplyNumbers(num,numb);
		System.out.print("Mult:"+product);
	}
	
	static void printName() {
		System.out.println("Karanvir");
	}
	static void addNumbers(int numa, int numb) {
		//This func will add 2 numbers..
		System.out.println("Sum of numbers:"+(numa+numb));
		
	}
	static int multiplyNumbers(int a, int b) {
		addNumbers(a,b);
		return a*b;
	}
		
	
}
