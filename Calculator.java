package Arithmetic_Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double a,b,result;
		System.out.println("----- Welcome to Calculator -----"+"\n");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc1.nextDouble();
		System.out.println("Enter Secound Number");
		b = sc2.nextDouble();
		
		System.out.println("----- Select the Operation -----"+"\n");
		System.out.println("Enter 1 to Add the two number");
		System.out.println("Enter 2 to Sub the two number");
		System.out.println("Enter 3 to Mul the two number");
		System.out.println("Enter 4 to Div the two number"+"\n");
		
		System.out.println("Enter your Choice");
		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();
		
		
		switch(Choice){
		
		case 1:
			
			result = a+b;
			System.out.println("The Addition of Two number = "+result );
			break;
			
		case 2:
			
			result = a-b;
			System.out.println("The Subtraction of Two number = "+result );
			break;
		
		case 3:
			
			result = a*b;
			System.out.println("The Multiplication of Two number = "+result );
			break;
			
		case 4:
			
			result = a/b;
			System.out.println("The Division of Two number = "+result );
			break;
			
		case 5:
			System.out.println("Exit");
			break;
			
		default :
				System.out.println("Enter the wrong choice" );
			
		}	
			
	}

}
