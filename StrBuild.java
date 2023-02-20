package str;

public class StrBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Hii");
		str.append(" "+"Prasanth");
		str.delete(6, 9);
		StringBuilder str1=new StringBuilder(5);
		str1.append("efwefdfasd");
		System.out.println(str.toString());
		System.out.println(str1);
	}

}
