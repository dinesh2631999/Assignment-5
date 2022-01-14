package departmentpackage;

import java.util.Scanner;

public class Hangman {
	
	public void playGame()
	{
		System.out.println("Welcome to the game");
		System.out.println("Get started");
	}
	
	public void viewInstruction()
	{
		System.out.println("Controls:-");
		System.out.println("       ctrl+j ---> Jump");
		System.out.println("       ctrl+r ---> Run");
	}
	
	public void exitGame()
	{
		System.out.println("Exiting.......");
		System.out.println("     ENDED   ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hangman hm=new Hangman();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PRESS 1 for playgame , 2 for viewInstuction , 3 for ExitGame");
		int i=scanner.nextInt();
		
		switch(i)
		{
		case 1:   hm.playGame();
		          break;
		          
		case 2:    hm.viewInstruction();
		           break;
		           
		case 3:	   hm.exitGame();
				   break;
					
		default:   System.out.println("Invalid input");
		}
			
	}

}
