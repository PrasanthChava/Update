package exception_handling;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		try
		{
			if(n<10)
			{
				throw new ArithmeticException();
			}
			else
			{
				int x=0;
				int m=n;
				while(m!=0)
				{
					int rem=m%10;
					x=x*10+rem;
					m=m/10;
				}
				System.out.println("Reverse of the number is"+" "+x);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Reverse of the number is"+" "+n);
		}
		

	}

}
