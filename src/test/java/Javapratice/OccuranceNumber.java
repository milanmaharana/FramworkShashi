package Javapratice;

public class OccuranceNumber {
	public static void main(String[] args) {
		int[]x= {55,10,20,58,10,20};
		for(int i=0;i<x.length;i++)
		{
			int count=0;
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
			if(count>0)
			{
				System.out.println(x[i]+"present"+count+"times");
			}
		}
	}
	

}
