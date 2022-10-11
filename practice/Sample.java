	/* 
 * Question : 
 * 				
 *  Write a Program To Demonstrate Count The Length of The String With Including Space 
 * 
 *  */
import java.util.LinkedList;
import java.util.List;
import java.util.*;

import static java.lang.System.*;
import java.util.Scanner;

public class Sample    
{    
    public static void main(String[] args) { 
//    	
//    	Scanner sc = new Scanner(System.in);
//    	System.out.print("Enter String >>> ");
//        String a = sc.next();    
//        int b = 0;    
//            
//        for(int i = 0; i < a.length(); i++) {    
//            if(a.charAt(i) != ' ')
//                b++;    
//        }    
//        System.out.println("String >>> "+a);
//        System.out.println("Number Count >>> " + b);  
//        
//        if (b % 2 ==0) {
//        	System.out.println("The Number Of Characters Are Even");
//        }
//        else {
//        	System.out.println("Number of Characters are Odd");
//    	
//        	System.out.println("---------------------------------------------");
//    	
//        	Scanner sc2 = new Scanner(System.in);
//        	System.out.print("Enter String >>> ");
//            String d = sc2.next();  
//            char[] len= d.toCharArray();
//    		int c=0;
//    		for(char ch : len)
//    		{
//    			c++;
//    		}		
//    		System.out.println("Number of Characters in String >> "+c);
//          if (c % 2 ==0) {
//        	System.out.println("The Number Of Characters Are Even");
//        }
//        else {
//        	System.out.println("Number of Characters are Odd");
//        }
    	
//    	Scanner sc3 = new Scanner(System.in);
//    	String name= sc3.next();
//    	
//    	System.out.println("Name:- "+ name);
//    	
//    	String a= name;
//    	System.out.println("Length of Char in Given Name: "+ a.length());
//    	
//    	if (a.length()%2==0 ) {
//    		System.out.println("Even");
//    	}
//    	else {
//    		System.out.println("Odd");
//    	}
    	
    	Scanner sc3 = new Scanner(System.in);
    	System.out.print("Enter Your Full Name >>> ");
    	
    	String name= sc3.nextLine();
    	
    	System.out.println("Full Name >>> " + name);
    	System.out.println("Length of Char >>> " + name.length());
 
    }
}
