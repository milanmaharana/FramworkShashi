package Javapratice;

public class Assedingorderandsum {
public static void main(String[] args) {
		
		int[]x= {15,45,82,64,20,10};
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
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
		}
	}





