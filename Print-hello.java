import java.util.Scanner;
class checker{
void check(int n)
{
    if(n>0)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Hello");
        }
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
