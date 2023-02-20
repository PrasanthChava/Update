package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\adithya\\OneDrive\\Desktop\\Text.txt");
		Scanner sc=new Scanner(f1);
		String S="";
		while(sc.hasNextLine())
		{
			S=S+sc.nextLine()+"\n";
		}
		System.out.println(S);
		FileWriter fr=new FileWriter("C:\\Users\\adithya\\OneDrive\\Desktop\\newText.txt");
		fr.write(S);
		fr.close();
	}

}
