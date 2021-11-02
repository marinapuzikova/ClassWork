package com.syntax.class09;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r = 5; r >= 1; r--) {// outer loop rows
			for (int c = 1; c <= 4; c++) { // control columns
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("**********************************");
		for (int r = 5; r >= 1; r--) {// outer loop rows
			for (int c = 1; c <= 4; c++) { // control columns
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println("**********************************");
		for (int r = 5; r >= 1; r--) {// outer loop rows
			for (int c = 4; c >= 1; c--) { // control columns
				System.out.print(c + " ");
			}
			System.out.println();

		}
		System.out.println("**********************************");
	}
}
