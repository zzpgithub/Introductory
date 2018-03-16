import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//***************************************
		//Easiest exercise ever
//		System.out.println("*");
		
		//***************************************
		//Draw a horizontal line
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if (n < 0) {
//			return;
//		}
//		for (int i = 0; i < n; i++) {
//			System.out.print("*");
//		}
		
		//***************************************
		//Draw a vertical line
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if (n < 0) {
//			return;
//		}
//		for (int i = 0; i < n; i++) {
//			System.out.println("*");
//		}
		
		//***************************************
		//Draw a right triangle
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if (n < 0) {
//			return;
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("*");
//		}
		
		//***************************************
		//Isosceles Triangle
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if (n <= 0) {
//			return;
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n-1-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 2*i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//***************************************
		//Diamond
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if (n <= 0) {
//			return;
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n-1-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 2*i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		for (int i = n-2; i >= 0; i--) {
//			for (int j = 0; j < n-1-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 2*i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//***************************************
		//Diamond with Name
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if (n <= 0) {
//			return;
//		}
//		for (int i = 0; i < n-1; i++) {
//			for (int j = 0; j < n-1-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 2*i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		System.out.println("Zengzhipeng");
//		
//		for (int i = n-2; i >= 0; i--) {
//			for (int j = 0; j < n-1-i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 2*i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//***************************************
		//FizzBuzz Exercise
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		if (n < 3) {
//			return;
//		}
//		for (int i = 1; i <= n; i++) {
//			if (i%3 == 0) {
//				if (i%5 == 0) {
//					System.out.println("FizzBuzz");
//				}
//				else {
//					System.out.println("Fizz");
//				}
//			}
//			else if (i%5 == 0) {
//				System.out.println("Buzz");
//			}
//			else {
//				System.out.println(i);
//			}
//		}
		
		//***************************************
		//Prime Factors Exercise
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n < 2) {
			return;
		}
		factor(n);

	}
	
	static boolean prime(int n)
	{  int i;
	boolean flag=true;
	   for(i=2;i<=n/2;i++)
	  if(n%i==0)
	  {flag=false;
	  return flag;
	  }
	   return flag;
	}
	static void factor(int n)
	{  int i;
	   i=2;
	   while  (i<=n)
	   {  if ((n%i==0)&&prime(i))
	   {   System.out.println(i);
	       n=n/i;
	       continue;
	   }
	   i++;
	   }
	}

}
