import java.lang.*;
import java.util.Scanner;
 class Main {

    public static void main(String[] args) {

        int count = 0; 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != 0)
        {
           num /= 10;
            ++count;
        }

        System.out.println(count);
    }
}
