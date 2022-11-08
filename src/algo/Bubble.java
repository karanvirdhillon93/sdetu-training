package algo;

public class Bubble {
	
	public static void bubSort(int[]x) {
		boolean sorted=true;
		do {
			sorted=true;
			//iterate over array
			for(int i=0;i<x.length-1;i++) {
				//if greater
				if(x[i]>x[i+1]) {
					//in here swap and sort false
					int temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
					sorted=false;
				}
			}
			
			
		}while(!sorted);
		for(int n: x) {
			System.out.println(n);
		}
	}
	
	public static void check(int[]x) {
		boolean sorted=false;
		do {
			for(int i=0;i<x.length-1;i++) {
				//if greater
				if(x[i]>x[i+1]) {
					//in here swap and sort false
					int temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
					sorted=true;
				}
		}
	}while(sorted);
		for(int n: x) {
			System.out.println(n);
		}
	}

}

