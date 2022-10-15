package com.core.bzl;
import java.util.*;
public class FlipCoin {

	

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter number of time flip a coin: ");
     int number = scan.nextInt(); 
     Float toss;
     int tailCount = 0;
     int headCount = 0;
     
     Random random = new Random();
     if (number > 0){
         for (int i = 1; i <= number; i++){
         toss = random.nextFloat();
            if (toss > 0.5)
            	tailCount++;
            else
            	headCount++;
         }
           float tailpercent = (tailCount/number) *100f;
            float headpercent = (headCount/number) *100f;
            
         
         
        
       
         System.out.println("total number of coin flipped: "+number);
         System.out.println("total number of count tail: "+tailCount);
         System.out.println("total number of count head: "+headCount);
         System.out.println("Percentage of head: "+ headpercent + "%");
         System.out.println("Percentage of tail: "+ tailpercent + "%");

            
	}
     else
    	 System.out.println("Invalid value: Can't flip a coin " + number + " times!");
}
}

