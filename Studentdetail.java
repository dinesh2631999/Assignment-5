package homework;

import java.util.Scanner;

public class Studentdetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the student roll no");
		int rollno=scanner.nextInt();
		
		System.out.println("Enter the student Name:");
		String name=scanner.next();
		
		System.out.println("Enter the student marks in Physics , Chemistry ,Computer Application");
		float phy=scanner.nextFloat();
		float chem=scanner.nextFloat();
		float comapp=scanner.nextFloat();
		
		float total=phy+chem+comapp;
		float percent=total/3;
		String division= (percent>50.0)? "First" : "Second" ;
		
		System.out.println(" Roll No: " +rollno);
		System.out.println(" Name of Student: " +name);
		System.out.println(" Marks in Physics : " +phy);
		System.out.println(" Marks in Chemistry : " +chem);
		System.out.println(" Marks in Computer Application : " +comapp);
		System.out.println(" Total Marks : " +total);
		System.out.println(" Percentage : " +percent);
		System.out.println(" Division : " +division);
		
		

	}

}
