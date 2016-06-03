package session5;

import java.util.Scanner;

class Area
{
	public Double triangle(Double lenght, Double breath, Double myInt)
	{
		return myInt*lenght*breath;
	}
}
public class Assignment1 extends Area {
public static void main(String[] args)
{
	Assignment1 demo=new Assignment1();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your selection for Triangle: 1 and for Rectangle: 2");
	int choice=sc.nextInt();
	Double cho1;
	Double cho2;
	switch(choice)
	{
		case 1:
			System.out.println("Enter the length");
			cho1=sc.nextDouble();
			System.out.println("Enter the breath");
			cho2=sc.nextDouble();
			System.out.println(demo.triangle(cho1, cho2, 0.5).toString());
			break;
		case 2:
			System.out.println("Enter the length");
			cho1=sc.nextDouble();
			System.out.println("Enter the breath");
			cho2=sc.nextDouble();
			System.out.println(demo.triangle(cho1, cho2,1.0).toString());
			break;
			default:
				System.out.println("Not valid");
				break;
	}
	sc.close();
}
}