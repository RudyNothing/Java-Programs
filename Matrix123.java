import java.util.*;
class Matrix123
{
   int sum(int a[][],int m,int n)
   {
     int sum=0,i,j;
     for(i=0;i<m;i++)
     {for(j=0;j<n;j++)
      {if(i==0||j==0||j==n-1||i==m-1)
          sum+=a[i][j];
       }
     }
     return sum;
   }
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     Matrix123 ob=new Matrix123();
     System.out.println("Enter size(m*n)");
     int m=sc.nextInt();
     int n=sc.nextInt();
     if(m>2&&m<8&&n>2&&n<8)
     {
       int i,j;
       int a[][]=new int[m][n];
       System.out.println("Enter element is array");
       for(i=0;i<m;i++)
       {for(j=0;j<n;j++)
        {a[i][j]=sc.nextInt();
        }}
       System.out.println("ORIGINAL MATRIX");
       for(i=0;i<m;i++)
       {for(j=0;j<n;j++)
         System.out.print(a[i][j]+"  ");
         System.out.println();
       }
       int s=ob.sum(a,m,n);
       System.out.println("SUM OF BOUNDARY ELEMENTS(UNSORTED)"+s);
       int A[]=new int[m*n];
       int k=0;
       for(i=0;i<m;i++)
       {for(j=0;j<n;j++)
        {A[k]=a[i][j];
         k++;
        }}
       for(i=0;i<A.length-1;i++)
       {for(j=0;j<A.length-1-i;j++)
        {if(A[j]<A[j+1])
          {int t=A[j];
            A[j]=A[j+1];
            A[j+1]=t;
         }}}
        k=0;
       for(i=0;i<m;i++)
       {for(j=0;j<n;j++)
        {a[i][j]=A[k];
          k++;
        }}
        System.out.println("SORTED MATRIX");
        for(i=0;i<m;i++)
       {for(j=0;j<n;j++)
         System.out.print(a[i][j]+"  ");
         System.out.println();
       }
       s=ob.sum(a,m,n);
       System.out.println("SUM OF BOUNDARY ELEMENTS(SORTED)"+s);
     }
     else
       System.out.println("OUT OF RANGE");
      }
}
       
       