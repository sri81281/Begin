package pka;

import java.util.Scanner;

public class ArrayInEvenPosition {
	public void startup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter" + " " + i + " " + "Indexof element");
			input[i] = sc.nextInt();
		}

		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Even position=" + input[i]);
			} else {
				System.out.println("Odd Position=" + input[i]);
			}
			sc.close();
		}
	}

	public static void main(String[] args) {
		ArrayInEvenPosition obj = new ArrayInEvenPosition();
		obj.startup();
	}
}
