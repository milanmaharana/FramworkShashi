package Javapratice;
//Addition of two array
public class AdditionOfTwoArra {
	public static void main(String[] args) {
		int[]a= {2,3,4,5,1};
		int[]b= {1,3,4,6};
		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for (int i=0;i<count;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
				
			}catch(Exception e) {
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
