package Javapratice;

public class Firstminimum {
	//first minimum number
	public static void main(String[] args) {
		int[]x= {7,2,5,3,8,6};
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int i=0;i<3;i++)
			sum=sum+x[i];
		{
		
		System.out.println(sum);
	}
	}
}
