package Javapratice;

public class AsendingOrder 
{
	//boobleshot program
	public static void main(String[] args) 
	{
	int[]x= {12,24,11,30,15,35,22};
	
	for(int i=0;i<x.length;i++)
	  {
	for(int j=i+1;j<x.length;j++)
	    {
	      if (x[i]> x[j])
			{
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
	     }
	}
	for(int z:x) {
		System.out.println(z+"  ");
	       }
				
	}

}
