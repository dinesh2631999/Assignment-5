package homework;

import java.util.Scanner;

public class Temperature
{
	public  static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the whether value:");
		float temp=scanner.nextFloat();
		
		System.out.println("Todays Temperature is : " + temp+"c");
	}
}