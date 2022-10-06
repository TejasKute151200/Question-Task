package practice;

	/*	
* 
*  Question : Write A Program to Demonstrate Following Output:
*  	
* 	A,B,C
* 	P:Q
* 	A,B,C,P:Q
* 	[A,B,C,P:Q]
* 
* 	*/

import java.util.*;

public class StringJoinerExample {
	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner(",");
		sj1.add("A").add("B").add("C");
		System.out.println(sj1);
	
		StringJoiner sj2 = new StringJoiner(":");
		sj2.add("P").add("Q");
		System.out.println(sj2);
	
		StringJoiner sj3 = new StringJoiner(",");
		sj3.merge(sj1).merge(sj2);
		System.out.println(sj3);
	
		StringJoiner sj4 = new StringJoiner(",", "[", "]");
		sj4.merge(sj1).merge(sj2);
		System.out.println(sj4);
	}
}