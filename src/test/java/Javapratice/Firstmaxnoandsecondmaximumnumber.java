package Javapratice;

public class Firstmaxnoandsecondmaximumnumber {
	public static void main(String[] args) {
	
		int[]x= {2,4,1,6,8};
		int fmax=x[0];
		int smax=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>fmax)
			{
				smax=fmax;
				fmax=x[i];
			}
			else if(x[i]>smax)
			{
				smax=x[i];
			}
		}
		System.out.println(fmax+" "+smax);
		}

	}

	