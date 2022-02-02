package PracticeJava;

public class AddingtwoarrayexnumArray {

	public static void main(String[] args) {
		int a []= {1,2,3,4};
		int b []= {1,2,8};
		
		int count=a.length;
		if(a.length<b.length) // 3<4
		{
			count=b.length; // 4
		}
		for(int i=0;i<count;i++)
		{
			try{
				     System.out.print(a[i]+b[i]+ " ");
			} catch(Exception e) {
				
				if(a.length>b.length)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(b[i]);
				}
			}
			
		}

	}

}
