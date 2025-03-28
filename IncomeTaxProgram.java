import java.util.*;
public class IncomeTaxProgram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String nm=sc.nextLine();
        System.out.println("Enter the Taxable Income");
        double taxinc=sc.nextDouble();
        double tax=0;
        if(taxinc<=100000)
        tax=0*taxinc;
        else if(taxinc>100000 && taxinc<=150000)
        tax=0.10*(taxinc-100000);
        else if(taxinc>150000 && taxinc<=250000)
        tax=5000 + 0.20*(taxinc-150000);
        else
        tax=25000 + 0.30*(taxinc-250000);
        System.out.println("Name \t Taxable Income \t Tax");
        System.out.println(nm + "\t" + taxinc + "\t" + tax);
    }
}