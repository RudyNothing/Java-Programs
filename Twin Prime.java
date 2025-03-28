import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num_1=sc.nextInt();
        System.out.println("Enter another Number");
        int num_2=sc.nextInt();
        int i=0,c=0,d=0;
        for(i=1;i<=num_1;i++)
        {
            if(num_1%i==0)
            c++;
        }
        for(i=1;i<=num_2;i++)
        {
            if(num_2%i==0)
            d++;
        }
        if(c==2&&d==2)
        {
            if(num_2-num_1==2)
            System.out.println("Twin Prime");
            else
            System.out.println("Not Twin Prime");
        }
        else
        System.out.println("Not Twin Prime");
    }
}