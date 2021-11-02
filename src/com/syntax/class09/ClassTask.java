package com.syntax.class09;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words=new String[5];
		
		words[0]="Java";
		words[1]="Saturday"; 
		words[2]="day.";
		words[3]="coding"; 
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		System.out.println("___________________________________________");
		String[] word= {"Java", "Saturday","day","coding","is"};
		System.out.println(word[0]);
		System.out.println(word[1]);
		System.out.println(word[2]);
		System.out.println(word[3]);
		System.out.println(word[4]);
		for (int i=0; i <word.length; i++ ) {
			System.out.println(word[i]);
		}
		System.out.println("___________________________________________");
	int[]num= {100,200,300,564};

	for (int i=0; i<num.length; i++) {
		System.out.print(num[i]+" ");
	}
	System.out.println("___________________________________________");
	//to access all elements from an array-->advanced /enhanced loop works only with array
	for (int n:num) {
		System.out.println(n);
	}
	}

}
