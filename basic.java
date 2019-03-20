import java.lang.*;
import java.util.Scanner;

 class checker {
void check(int n){
if(n>0)
{System.out.println("POSITIVE");}
else if(n<0)
{
System.out.println("NGATIVE");
}
else
{System.out.println("ZERO");}
}
}

public class basic{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number to be checked:");
int n = scan.nextInt();
checker o = new checker();
o.check(n);
} 
}
