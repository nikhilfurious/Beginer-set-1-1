import java.lang.*;
import java.util.Scanner;

 class checker {
void fun(int n){
if(n%2==0)
{System.out.println("EVEN");}
else 
{
System.out.println("ODD");
}
}
}

public class oddeven{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("INPUT:");
int n = scan.nextInt();
checker o = new checker();
o.fun(n);
} 
}
