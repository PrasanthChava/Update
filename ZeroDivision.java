package exception_handling;

import java.util.*;
public class ZeroDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=10,j,k;
		j=sc.nextInt();
		try
		{
			k=i/j;
			System.out.println("Answer is"+" "+k);
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide an integer with zero"+" "+e);
		}
	}

}
