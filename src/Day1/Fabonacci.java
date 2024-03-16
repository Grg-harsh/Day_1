package Day1;
import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first  = 0;
        int second = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(first);
            int third = first+second;
            first = second;
            second = third;
        }

    }
}
