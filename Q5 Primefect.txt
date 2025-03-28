import java.util.*;
public class Primefect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        System.out.println("Enter 1 to check whether the number is an Emirp number or not");
        System.out.println("Enter 2 to check whether the number is a Perfect number or not");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: int i=0,c=0,rev=0,r=0,t=n,d=0;
                    for(i=1;i<=n;i++)
                    {
                        if(n%i==0)
                        c++;
                    }
                    while(t>0)
                    {
                        r=t%10;
                        rev=rev*10+r;
                        t=t/10;
                    }
                    for(i=1;i<=rev;i++)
                    {
                        if(rev%i==0)
                        d++;
                    }
                    if(c==2&&d==2)
                    System.out.println("The Number is an Emirp Number");
                    else
                    System.out.println("The Number is not an emirp number");
                    break;
            case 2: int j=0,sum=0;
                    for(j=1;j<n;j++)
                    {
                        if(n%j==0)
                        sum=sum+j;
                    }
                    if(sum==n)
                    System.out.println("The Number is a Perfect Number");
                    else
                    System.out.println("The Number is not a Perfect Number");
                    break;
            default:System.out.println("Wrong Choice Entered");
        }
    }
}