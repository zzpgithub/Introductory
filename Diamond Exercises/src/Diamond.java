import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n <= 0) {
			return;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = n-2; i >= 0; i--) {
			for (int j = 0; j < n-1-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
    }
}
