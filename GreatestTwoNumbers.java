import java.util.*;
public class GreatestTwoNumbers
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      int a=sc.nextInt();
      System.out.println("Enter the second number");
      int b=sc.nextInt();
      if(a>b)
       System.out.println("The Greatest Number is" + " " + a);
      else
       System.out.println("The Greatest Number is" + " " + b);
    }
}