package Myproject;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		
		Scanner imblory =new Scanner (System.in);
		
		System.out.println("Enter the Number 1 ->");
		int n1=imblory.nextInt();
		System.out.println("Enter the operation  ->");
		String op=imblory.next();
		
		System.out.println("Enter the Number 2 ->");
		int n2=imblory.nextInt();
		
		
		switch (op) {
		
		case "+" :	System.out.println("The sum is -> "+(n1+n2)); break;
		case "-" :  System.out.println("The sup is -> "+(n1-n2)); break;
		case "*" :  System.out.println("The mult is -> "+(n1*n2)); break;
		case "/" :  System.out.println("The div is -> " +(n1/n2)); break;
		default:System.out.println("Eror Operation");
		
		}
		
		
	}

}
