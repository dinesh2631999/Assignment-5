package homework;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
	   
		// TODO Auto-generated method stub
		char ch;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any Grade from the following Grade :-  E,V,G,A");
	     ch=scanner.next().charAt(0);
		
		if(ch=='E')
		   {
				System.out.println(" Excellent");
			}
			else if(ch=='V')
			{
				System.out.println(" Very Good");
			}
			else if(ch=='G')
			{	
				System.out.println(" Good");
			}
			else if(ch=='A')
			{
			System.out.println(" Average");
			}
		
	
}
}