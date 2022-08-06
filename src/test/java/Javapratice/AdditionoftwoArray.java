package Javapratice;

public class AdditionoftwoArray {
	public static void main(String[] args) {
		
		int a[]= {4,5,6,7,8};
		int b[]= {2,4,5,6,6,9};
		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			}catch(Exception e)
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]);
		}else {
			System.out.println(b[i]);
		}
		
				
			}
		}
	}

}
