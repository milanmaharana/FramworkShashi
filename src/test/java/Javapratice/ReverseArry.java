package Javapratice;

public class ReverseArry {
	public static void main(String[] args) {
		
		int[]x={12,24,11,30};
		int[]revers=new int[x.length];
		int count=0;
		
		for(int i=x.length-1;i>=0;i--)
		{
			revers[count++]=x[i];
		}
		System.out.println("reverse array");
		for(int z:revers) 
		{
			System.out.println(z+"  ");
		}
	}

}
