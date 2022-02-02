package PracticeJava;

public class SumofGroupofnums {

	public static void main(String[] args) {
		
		String s="15a10b23";
		int sum=0;
		int tsum=0;
		
		for(int i=0;i<s.length(); i++)
		{ 
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum*10 + n;
			}
			else
			{
				tsum = tsum+sum;
				sum=0;
			}
			
		}
           tsum=tsum+sum;
           System.out.println(tsum);
	}

}
