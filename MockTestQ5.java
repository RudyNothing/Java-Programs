import java.util.*;
public class MockTestQ5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String s1=sc.nextLine();
        System.out.println("Enter the 2nd String");
        String s2=sc.nextLine();
        System.out.println("Enter the 3rd String");
        String s3=sc.nextLine();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        s3=s3.toUpperCase();
        int m1=s1.length();
        int m2=s2.length();
        int m3=s3.length();
        if(m1>m2)
        {
            if(m1>m3)
            System.out.println("The Longest String is" + " " + s1);
            else
            System.out.println("The Longest String is" + " " + s3);
        }
        else
        {
            if(m2>m3)
            System.out.println("The Longest String is" + " " + s2);
            else
            System.out.println("The Longest String is" + " " + s3);
        }
        if(m1<m2)
        {
            if(m1<m3)
            System.out.println("The Shortest String is" + " " + s1);
            else
            System.out.println("The Shortest String is" + " " + s3);
        }
        else
        {
            if(m2<m3)
            System.out.println("The Shortest String is" + " " + s2);
            else
            System.out.println("The Shortest String is" + " " + s3);
        }
    }
}