import java.util.Scanner;

/* 
 * Question :
 * 
 *  Write a Program To Demonstrate Addition Of n Numbers Taking From User by Array 
 * 
 */

public class Sample2 {
	
public static void main(String[] args) {
	
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter Limits >>> ");
//	
//	int l = sc.nextInt();
//	int[] arr = new int[l]; 
//	 
//	for (int i=1 ; i<=l; i++) {
//		int n=sc.nextInt();
//		
////		while(l>i) {
////		int b =sc.nextInt();
////		n=n+b;	
//		
//		
//	}
	
	int n;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	
	n=sc.nextInt();  
	
	
	int[] array = new int [n] ;
	System.out.println("Enter the elements of the array: "); 
	
	for(int i=0; i<n; i++)  
	{  
	array[i]=sc.nextInt(); 
	}  
	
	System.out.println("Array elements are: ");
	 
	for (int i=0; i<n; i++)   
	{  
	System.out.print(array[i]+" "); 
	}
	
	int sum = 0;
	 for (int i = 0; i < array.length; i++) {  
	       sum = sum + array[i];    
	     }  
	 System.out.println();
	 
	 System.out.println("Sum of the Array Elements Are >>> "+sum);
}
}
	

