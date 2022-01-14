package homework;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println(" Enter any one number b/w 1to7 to know which day it is? ");
		int day=scanner.nextInt();
		
		switch(day)
		{
		case 1:   System.out.println(" Today is Sunday");
		          break;
		          
		case 2:   System.out.println(" Today is Monday");
        		  break;
        			
		case 3:   System.out.println(" Today is Tuesday");
        		  break;
        			
		case 4:   System.out.println(" Today is Wednessday");
        		  break;
        		  
		case 5:   System.out.println(" Today is Thursday");
        		  break;
        		  
		case 6:   System.out.println(" Today is Friday");
        		  break;
        		  
		case 7:   System.out.println(" Today is Saturday");
          		  break;
          		  
		default :   System.out.println(" Read the sentance carefully");
		}
		

	}

}
