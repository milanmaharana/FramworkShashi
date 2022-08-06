package Javapratice;

public class reverswithoutLength {
	public static void main(String[] args) {
		String s="milan";
		char[] conChar=s.toCharArray();
		int count=0;
		for(char c: conChar) {
			count++;	
		}
		//System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
