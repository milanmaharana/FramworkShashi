package Javapratice;

public class Revarse_ofString {
	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[]str=s.split(" ");
		
		for(String string:str) {
			
			for(int i=string.length()-1;i>=0;i--)
			{
				System.out.print(string.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
