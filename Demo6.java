package com.studyopedia;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
          System.out.println("enter number of terms"); 
          int number = 8; 
          int first = 1, second = 2, next; 
          System.out.println("Fibonacci series is "); 
          for ( int i = 0; i<=number; i++) 
            { 
                System.out.println(first + ""); 
                next = second+first; 
                first = second; 
                second = next; 
            } 
	}

}
