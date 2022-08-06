package Javapratice;

public class RevarseusingRecursion {
	
		String s="milan";
		String rev="";
		int  length =s.length()-1;
		 
		public void m1() {
			if (length>=0) {
				rev=rev+s.charAt(length);
				length--;
				m1();
				
			}
		}
	
public static void main(String[]args) {
	RevarseusingRecursion r=new RevarseusingRecursion();
	r.m1();
	System.out.println(r.rev);

}}
