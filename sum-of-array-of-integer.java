import java.util.Scanner;
class checker{
    int sum=0;
       int a[] = new int[100];
       Scanner s = new Scanner(System.in);
       
void check(int n,int k)
{
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    for(int l=0;l<k;l++)
    {
        sum+=a[l];
    }
    System.out.println(sum);
}
}

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt(); 
    int k = sc.nextInt();
 
    checker o = new checker();
    o.check(n,k);
  }
}
