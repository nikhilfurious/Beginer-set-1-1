import java.util.Scanner;
class checker{
    int sum=0;
void check(int n)
{
    {
        for(int i=1;i<=n;i++)
        {
          sum+=i;
          
        }
        System.out.println(sum);
    }
}
} 

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt(); 
    checker o = new checker();
    o.check(n);
  }
}
