package primedigits;
import java.io.*;

public class primedigits {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int raw;
	int inp;
	int dig =0;
	int cnt = 0;
	int sum;
	
	int fin;
	String x;
	
	
	void input()throws Exception
	{
		System.out.println("input");
		x = br.readLine();
		inp = Integer.parseInt(x);
		raw = inp;
	}
	void calc()throws Exception
	{
		
		 for(int i = 0;i<=inp;i++)
		 {
			 
			 dig = raw%10;
			
			 int j  = 1;
					 
			 	while(j<=dig)
			 	{
			 		
			 		if(dig % j==0)
			 		{
			 			cnt++;
			 			
			 			j++;
			 		}
			 		else if(dig % j!=0)
			 		{
			 			j++;
			 		}
			 	}
			 	
			 	
		 
			 	if(cnt<=2)
			 	{
			 		
			 		sum = sum+dig;
			 		
			 		cnt = 0;
			 		j=1;
			 		raw=raw/10;
			 	}
			 	else
			 	{
			 		
			 		cnt=0;
			 		j=1;
			 		raw=raw/10;
			 	}
			
		 }
		 System.out.println("The sum of the prime numbers of the number: "+inp+" is "+sum);
	}
			
			
	public static void main(String[]args)throws Exception
	{
		primedigits o1 = new primedigits();
		o1.input();
		o1.calc();
	}

}
