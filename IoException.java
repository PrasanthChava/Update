package exception_handling;

import java.util.Scanner;

public class IoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		try
		{
			i=sc.nextInt();
			System.out.println("Enterd integer is"+" "+i);
		}
		catch(Exception e)
		{
			System.out.println("i can only store integer"+" "+e);
		}
	}

}
