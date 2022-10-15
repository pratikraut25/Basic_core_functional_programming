package com.core.bzl;
import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter Any two number: ");
          int num1 = scan.nextInt();
          int num2 = scan.nextInt();
          
          Float quotient = (float)num1/num2;
          int remainder = num1 % num2;
          
          System.out.println("Quotient: "+quotient);
          System.out.println("Remainder: "+remainder);

	}

}
