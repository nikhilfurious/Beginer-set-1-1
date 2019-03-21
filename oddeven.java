import java.lang.*;
import java.util.Scanner;

 class checker {
void fun(int n){
if((n%2==0)&&(n>0))
{System.out.println("EVEN");}
else if((n%2!=0)&&(n>0))
{System.out.println("ODD");}
else
{System.out.println("INVALID");}
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
