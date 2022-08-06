package Javapratice;

public class Stringprogramm {
	public static void main(String[] args) {
		String s="I love my india";
		String[] str=s.split("");
		int count=0;
		for(String s1:str) {
			System.out.println(s1);
			count++;
			
		}
		System.out.println("total no fo words are "+count);
	}

}
