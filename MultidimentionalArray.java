package pka;

import java.util.Scanner;

public class MultidimentionalArray {
	public void leftRotate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of row");
		int row = sc.nextInt();
		System.out.println("enter the number of colum");
		int colum = sc.nextInt();
		int input[][] = new int[row][colum];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.println("enter the value of" + i + "" + j);
				input[i][j] = sc.nextInt();
			}
		}
		System.out.println("input");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("output");
		for (int i = input.length - 1; i >= 0; i--) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

	public static void main(String[] args) {

		MultidimentionalArray obj = new MultidimentionalArray();
		obj.leftRotate();

	}
}
