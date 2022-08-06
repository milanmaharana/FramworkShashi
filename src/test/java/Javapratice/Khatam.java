package Javapratice;

import java.util.LinkedHashSet;

public class Khatam {
	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[]sp=s.split(" ");
		
		LinkedHashSet<String>hs=new LinkedHashSet<String>();
		for(String convert:sp) {
			hs.add(convert);
			
		}
		for(String word:hs) {
			int count=0;
			for(String com:sp) {
				if(word.equals(com)) {
					count++;
				}
			}
			System.out.println(word+" "+count);
		}
	} 
	

}
