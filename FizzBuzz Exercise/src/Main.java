import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n < 3){ return; }
		for (int i = 1; i <= n; i++) {
			if (i%3 == 0) {
				if (i%5 == 0) {
					System.out.println("FizzBuzz");
				}
				else {
					System.out.println("Fizz");
				}
			}
			else if (i%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
    }
}
