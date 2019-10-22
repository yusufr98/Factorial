package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner k = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int x = k.nextInt();
	    int f = 1;
        for(int i = x; i > 0 ; i--){
	        f = i * f;
        }
        System.out.println("The factorial of "+ x + " is " + f);
    }
}
