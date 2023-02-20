package str;

public class StrBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Prasanth");
		sb.append(" "+"sdasda"+"dfasdfads");
		sb.deleteCharAt(2);
		String str=sb.toString();
		System.out.println(str);
	}

}
