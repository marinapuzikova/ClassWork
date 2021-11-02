package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// 1 way of creating an array
		char []grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println("size of array is "+grade.length);
		System.out.println(grade[1]);
		
		int num;
		num=10;
		char[] gender; //declare an array!!!!!
		gender=new char[2]; //initialize the size!!!!!
		
		
		// 2 way of creating an array
		//elements inside array always stored based on index(index starts from )
		char []gradeArray= {'A','B','C','D'};
		System.out.println(gradeArray.length); //4 elements
		System.out.println(gradeArray[2]);//grade C
		System.out.println("***********************************************");
		String [] name= {"Irina","Marina","Anna"};
		System.out.println(name[1]);
		name[0]="Ahmed";
		System.out.println("after changing name Irina to "+name[0]);
		//name[4]="John";  out of boundaries because where is no index 4
		String[] cars=new String[3]; //longer way to create array
		 //int []nums;  -->declaration
		//num={10,14,16}; -->initialization (compiler will complain on this line)
		
		int[] nums= {10,12,16};
		
	}

}
