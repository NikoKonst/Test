package ex013;
import java.util.Scanner;
public class SimpleCalculatorVersion2 {
	public static void main(String [] args) {
		System.out.println("Simple Calculator");
		System.out.print("Give me the first integer:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print("Give me the second integer:");
		int y=sc.nextInt();
		System.out.println("Give a number from 1 to 5 :");
		System.out.print("1-Addition,2-Subtraction,3-Multiplication,4-Division, 5-Modulo: ");
		int i=sc.nextInt();
		int result;
		
		switch(i) {
		case 1:
			result=x+y;
			System.out.println(x + " + " + y + " = " + result );
		break;
		
		case 2:
			result=x-y;
			System.out.println(x + " - " + y + " = " + result );
		break;
	
		case 3: 
			result=x*y;
			System.out.println(x + " * " + y + " = " + result);
		break;
	
		case 4: 
			result=x/y;
			System.out.println(x + " / " + y + " = " + result);
		break;
	
		
		case 5:
			result=x%y;
			System.out.println(x + " % " + y + " = " + result);
		break;
		
		default:
			System.out.println("Wrong number, try again");
		break;
	}
		/*if (i==1) {
			result=x+y;
			System.out.println(x + " + " + y + " = " + result );
			}
		else if (i==2) {
			result=x-y;
			System.out.println(x + " - " + y + " = " + result );
		}
		else if (i==3) {
			result=x*y;
			System.out.println(x + " * " + y + " = " + result);
		}
		else if (i==4) {
			result=x/y;
			System.out.println(x + " / " + y + " = " + result);
		}
		else {
			result=x%y;
			System.out.println(x + " % " + y + " = " + result);*/
		}
	}
