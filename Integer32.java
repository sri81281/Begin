package pka;

import java.util.Scanner;

public class Integer32 {
	public void input() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input > 0) {
			System.out.println("given number is positive=" + input);
		} else {
			System.out.println("given number is negative=" + input);
		}
		sc.close();
	}

	public static void main(String[] args) {
		Integer32 obj = new Integer32();
		obj.input();
	}
}
