package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10;
System.out.println(num);
int[] array=new int[4];// how many elements we want
array[0]=12;
array[1]=10;
array[2]=13;
array[3]=(int)14.99;
System.out.println(array[2]+array[3]);


//array that will hold elements double type of values

double[] arr=new double[3];
arr[0]=13.99;
arr[1]=15.76;
arr[2]=18.36;	
//can i replace value of the array?
arr[1]=100.99;
System.out.println("after chanching value "+arr[1]);

// i want to create an array that will store 4 colors
String[] colors=new String[4];
//colors[0]="red";
colors[1]="blue"; 
colors[2]="black";
colors[3]="blue"; //we can store same value
System.out.println(colors[3]);
System.out.println("size of array is "+colors.length);// see how many elements inside array
System.out.println(colors[2]);
System.out.println(colors[0]); // default value for a string will print "null" 

System.out.println("********************************************");
 
char []grade=new char[6];
grade[0]='A';
grade[1]='B';
grade[2]='C';
grade[3]='D';
grade[4]='E';
grade[5]='F';
System.out.println("size of array is "+grade.length);
System.out.println(grade[1]);
//byte[] smallArray=new byte[-1]; array cannot have negative size//we will get NegativeArraySizeException
	}

}
