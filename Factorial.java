package Day4;
//Q 6 wap to print factorial of a number
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int i,fact=1;  
		  int number; //It is the number to calculate factorial  
		  System.out.println("Enter the Number");
		  Scanner s=new Scanner(System.in);
		  number=s.nextInt();
		  for(i=1;i<=number;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}
