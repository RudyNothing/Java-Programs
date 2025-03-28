import java.util.*;
public class Pallinrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        System.out.println("Enter 1 to check whether the number is a palprime number or not");
        System.out.println("Enter 2 to check whether the number is an armstrong number or not");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1: int r=0,t=n,rev=0,i=0,c=0;
                    while(t>0)
                    {
                        r=t%10;
                        rev=rev*10+r;
                        t=t/10;
                    }
                    if(rev==n)
                    {
                        t=n;
                        for(i=1;i<=t;i++)
                        {
                            if(t%i==0)
                            c++;
                        }
                        System.out.println("The Number is a Palprime Number");
                    }
                    else
                    System.out.println("The Number is not a Palprime Number");
                    break;
            case 2: int s=0,sum=0,co=n;
                    while(co>0)
                    {
                        s=co%10;
                        sum=sum + s*s*s;
                        co=co/10;
                    }
                    if(sum==n)
                    System.out.println("The Number is an Armstrong Number");
                    else
                    System.out.println("The Number is not an Armstrong Number");
                    break;
            default: System.out.println("Wrong Choice Entered");
        }
    }
}