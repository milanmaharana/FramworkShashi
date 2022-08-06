package Javapratice;

public class SumofTowNimber {
	public static void main(String[] args) {
		int n=56;//5+6=11output
		int sum=0;
		
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
	
}
