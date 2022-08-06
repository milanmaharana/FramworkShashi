package Javapratice;

public class Stringprogram1 {
	public static void main(String[] args) {
		String s="Automation";
		String[]str=s.split("");
		int count=0;
		for(String s1:str)
		{
			System.out.println(s1);
			count++;
			
		}
		System.out.println(count);
	}

}
