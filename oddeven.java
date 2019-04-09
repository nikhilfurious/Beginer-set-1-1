import java.lang.*;
import java.util.Scanner;

class checker {
void check(int n)
{
    if(n>0)
    {
        if(n%2==0)
        {System.out.println("Even");}
        else
        {System.out.println("Odd");}
        
    }
    else
    {System.out.println("invalid");}
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
