package Javapratice;

public class pelindromNumber {
	
		int sum=0;
		public boolean Checkpalindrome(int num)
		{
			int rev=reverseNum(num);
			{
				if (rev==num)
				{
					return true;
				}
				else
				{
					return false;
				}
				}
				
			}
			public int reverseNum(int num)
			{

			if(num!=0)
				{
					int rem=num%10;
					sum=(sum*10)+rem;
					num=num/10;
					reverseNum(num);
					
				}
				return sum;
			}
			public static void main(String[]args){
			{
				pelindromNumber p=new pelindromNumber();
				System.out.println(p.Checkpalindrome(121));
			}
		
	}
	
				
}
