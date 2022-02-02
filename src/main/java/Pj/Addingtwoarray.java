package Pj;

public class Addingtwoarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,8};
		int b[]= {4,5,6};
		int count=a.length;
		
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{
			try 
			{
				System.out.print(a[i]+b[i] + " ");
			}
			catch(Exception e) {

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
