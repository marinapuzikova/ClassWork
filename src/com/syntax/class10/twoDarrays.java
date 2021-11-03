package com.syntax.class10;

public class twoDarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]bigArray=new int[3][3];
//adding elements inside 1 row
bigArray[0][0]=10;
bigArray[0][1]=20;
bigArray[0][2]=30;
//adding elements inside 2nd row
bigArray[1][0]=1;
bigArray[1][1]=2;
bigArray[1][2]=3;
//adding elements inside 3rd row
bigArray[2][0]=100;
bigArray[2][1]=200;
bigArray[2][2]=300;

//how to access?
System.out.println(bigArray[2][1]);//200
//what it shows?
System.out.println("2D array size "+bigArray.length);//returns # of 1d array
System.out.println("_____________________________________");
//short way
// lets create 2 D array of groceries
String[][] groceries= {
		{"banana","apple","mango"},
		{"potato","tomato"},
		{"milk","cheese","yogurt"}
					  };
System.out.println(groceries.length);
//want to print yogurt
System.out.println(groceries[2][2]);
// i want to find how many elements my 1st Array has
System.out.println("# of elements inside first array ="+groceries[0].length);
System.out.println("# of elements inside first array ="+groceries[1].length);
System.out.println("# of elements inside first array ="+groceries[2].length);
System.out.println("_____________________________________");
//how do we get all elements from 2D array????
int total=0;
for (int i=0;i<groceries.length;i++) { //iterates over arrays (number of rows)
	for(int j=0; j<groceries[i].length;j++) {//iterates over elements of each array(number of columns)
		System.out.print(groceries[i][j]+" ");
		total++;
	}
	System.out.println();
}
System.out.println("# of elements is "+total);
System.out.println("_____________________________________");
		}

}
