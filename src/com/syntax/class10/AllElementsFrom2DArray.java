package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		//2 D array is array of arrays
	
		String[][] groceries= {
				{"banana","apple","mango"},//0
				{"potato","tomato"},//1
				{"milk","cheese","yogurt"}//2
							  };
		for(String[] grocery:groceries) {
			for( String g:grocery) {
				System.out.print(g+" ");
			}
			System.out.println();
	}

}
}
