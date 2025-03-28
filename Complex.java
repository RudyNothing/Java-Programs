import java.util.Scanner;
class Complex 
{
    double rl,img;
    Complex(double real,double imag)
    {
        rl=real;
        img=imag;
    }
    Complex plus(Complex b)
    {
      Complex ob=new Complex(0,0);
      ob.rl=rl+b.rl;
      ob.img=img+b.img;
      return ob;
    } 
    Complex times(Complex b)
    {
        Complex ob = new Complex(0,0);
        ob.rl=rl*b.rl-img*b.img;
        ob.img=rl*b.img+img*b.rl;
        return ob;
    }   
    double abs()
    {
        double abs=Math.sqrt((rl*rl+img*img));
        return abs;
    }
    double Re()
    {
        return rl;
    }
    double Im()
    {
        return img;
    }
    String tostring()
    {
        String s;
        if(img<0.0)
        s=""+rl+img+"i";
        else
        s=""+rl+"+"+img+"i";
        return s;
    }
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter the real & imaginary parts of a complex number");
      double r=sc.nextDouble();
      double i=sc.nextDouble();
      Complex ob1 = new Complex(r,i);
      System.out.println(" Enter the real & imaginary parts of a complex number");
      double r1=sc.nextDouble();
      double i1=sc.nextDouble();
      Complex ob2 = new Complex(r1,i1);
      System.out.println("The complex numbers are:-");
      System.out.println("1="+ob1.tostring());
      System.out.println("  Magnitude->"+ob1.abs());
      System.out.println("  Real Part->"+ob1.Re());
      System.out.println("  Imaginary Part->"+ob1.Im());
      System.out.println("2="+ob2.tostring());
      System.out.println("  Magnitude->"+ob2.abs());
      System.out.println("  Real Part->"+ob2.Re());
      System.out.println("  Imaginary Part->"+ob2.Im());
      System.out.println("Their sum is = "+ob1.plus(ob2).tostring());
      System.out.println("Their product is = "+ob1.times(ob2).tostring());  

    }
}
