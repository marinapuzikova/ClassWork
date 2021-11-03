package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] grades= {'A','B','C'};
for(char grade:grades) {
	System.out.println(grade);
}
System.out.println("_______________________________________________-");
		//3-1 because index is 0,1,2
for(int i=grades.length-1;i>0;i--) {
	System.out.println(grades[i]);
}
	}

}
