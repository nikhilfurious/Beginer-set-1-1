import java.lang.*;
import java.util.Scanner;
public class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n%400 == 0)
 System.out.println("leap ");
else if (n%4 == 0 && n%100 != 0)
   System.out.println(" leap ");    
else
    System.out.println("Not a leap");

}
}
