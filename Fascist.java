import java.util.*;
class Fascist
{
	String num;
	int m,n,c;
	int two,three;
	
	public Fascist(int a,int b)
	{
		m=a;
		n=b;
		two=0;
		three=0;
		c=0;
	}
	
	boolean FastMussolini(int c)
	{
		two=c*2;
		three=c*3;
		String two = Integer.toString(two);
		String three = Integer.toString(three);
		String fir = Integer.toString(c);
		num= fir + tw + th;
		String arr[] = {"0","1","2","3","4","5","6","7","8","9"};
		int i=0,j=0,count=0;
		boolean t = false;
		for(i=0;i<num.length();i++)
		{
			count = 0;
			char ch = num.charAt(i);
			for(j=0;j<arr.length;j++)
			{
				if(ch==arr[j])
					count++;
			}
			if( count==1)
				t=true;
			else
				t=false;
		}
		if(t==true)
		{
			return(true);
			c++;
		}
		return (false);
	}

	void dispHitler()
	{
		System.out.println("The Fascist Numbers are :");
		int i=0;
		boolean lexi=false;
		for(i=m ; i<n; i++)
		{
			lexi=FastMussolini(i);
			if(f==true)
			{
				System.out.print(i+ " ");
		}
		System.out.println("The Frequency of Fascist Number is : " +c);
	}


	class Demo
	{
		public static void main (String args[])
		{
			Scanner sc= new Scanner(system.in);
			System.out.println("Enter the value of m");
			int p=sc.nextInt();
			System.out.println("ENTER THE VALUE OF N");
			int q=sc.nextInt();
			if(p<q)
				System.out.println("Correct Input");
			else 
				System.exit(O);
			if(p<99 && q>99 && p<10000 && q<10000)
				System.out.println("Correct Input-Final");
			else
			{
				System.out.println("Wrong Input");
				System.exit(0);
			}
			Fascist ob = new Fascist(p,q);
			ob.dispHitler();
		}	
	}
	
}
