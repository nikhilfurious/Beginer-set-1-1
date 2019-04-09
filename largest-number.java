import java.util.Scanner;
class checker{
void check(int x,int y,int z)
{
    if (x > y && x > z)
      System.out.println(x);
    else if (y > x && y > z)
      System.out.println(y);
    else if (z > x && z > y)
      System.out.println(z);
    else
      System.out.println("not distinct");
}
} 
class Main
{
  public static void main(String args[])
  {
    int x, y, z;
   // System.out.println("Enter three integers");
    Scanner in = new Scanner(System.in);
 
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
 
checker o = new checker();
o.check(x,y,z);
  }
}
