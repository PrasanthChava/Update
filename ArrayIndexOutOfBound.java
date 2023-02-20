package exception_handling;

import java.util.*;
public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		int[] A=new int[n];
		try
		{
			for(int i=0;i<=n;i++)
			{
				A[i]=sc.nextInt();
			}
			for(int i : A)
			{
				System.out.println(A[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
