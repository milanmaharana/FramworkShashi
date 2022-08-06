package Javapratice;

public class patternX {
	
	public static void main(String[] args) {
		int []x= {1,2,1,3,4};
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i]==x[j]&&i>j)
				{
					break;
					
				}
				if(x[i]==x[j])
				{
				count++;	
				}
			}
			if (count>0)
			{
				System.out.println(x[i]+"present"+count+"times");
			}
		}
	}}
	
