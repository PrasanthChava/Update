package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=10,b,c;
		b=sc.nextInt();
		try
		{
			c=a/b;
			int[] Arr=new int[b];
			for(int i=0;i<=b;i++)
			{
				Arr[i]=i+1;
			}
			for(int i=0;i<=b;i++)
			{
				System.out.print(Arr[i]);
			}
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("UnKnown Exception");
		}
		finally
		{
			System.out.println("This will always be executed");
		}
		sc.close();
				
	}

}
