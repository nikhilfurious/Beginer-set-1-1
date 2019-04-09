import java.lang.*;
import java.util.Scanner;

class checker {
void check(int n){
if(n>0)
{System.out.println("Positive");}
else if(n<0)
{
System.out.println("Negative");
}
else
{System.out.println("Zero");}
}
}

class Main{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
checker o = new checker();
o.check(n);
} 
}
