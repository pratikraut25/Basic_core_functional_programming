package com.core.bzl;
import java.util.*;
public class SwapTwoNo {

	public static void main(String[] args) {
		 int x, y, t;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X: ");  
	       x = sc.nextInt(); 
	       System.out.println("Enter the value of Y: ");  
	       y = sc.nextInt();  
	       System.out.println("before swapping numbers: "+x +"  "+ y);  
	       /*swapping */  
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  

}
}