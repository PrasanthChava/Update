package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\adithya\\OneDrive\\Desktop\\SacramentocrimeJanuary2006.csv");
		try (Scanner sc = new Scanner(f)) {
			String vals="";
			String i="";
			String[] S =new String[10];
			while((i=sc.nextLine())!=null)
			{
				vals=vals+sc.nextLine()+"\n";
				S=i.split(",");
			}
			System.out.println(S);
		}
		
	}

}
