package exception_handling;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) throws ArithmeticException  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=10,m;
		m=sc.nextInt();
		int x=n/m;
		if(m!=0)
		{
		System.out.println(x);
		}
		else
		{
		throw new ArithmeticException("Zero Division Error");
		}
	}

}
