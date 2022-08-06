package Javapratice;

public class Fmaxnumberwithoutusingboolesort {
	public static void main(String[] args) {
		int[]x= {4,7,2,3};
		int fmax=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>fmax)
			{
				fmax=x[i];
				
			}
		}
		System.out.println(fmax);
	}

}
