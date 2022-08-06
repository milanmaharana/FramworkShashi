package Javapratice;
//Shorting
public class Shorting {
	public static void main(String[] args) {
		int[] x= {1,0,1,0};
		int[] a=new int[x.length];
		int m=0;
		int n=x.length-1;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==0)
			{
				a[n]=x[i];
				n--;
				
			}else {
				a[m]=x[i];
				m++;
				
			}
				
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
