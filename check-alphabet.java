import java.lang.*;
import java.io.*;
import java.util.Scanner;
class checkcode
{
    void check(char ch)
    {
        if((ch >= 'a') && (ch<='z'))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("no");
        }
    }
}
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        checkcode o = new checkcode();
        o.check(ch);
    }
}
