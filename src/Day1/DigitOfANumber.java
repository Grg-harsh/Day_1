package Day1;
import java.util.Scanner;
public class DigitOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int on = n;
        int mul = 1;
        while(on > 9){
            on = on/10;
            mul = mul*10;
        }
        while(n != 0){
            int digit = n/mul;
            System.out.println(digit);
            n = n%mul;
            mul = mul/10;
        }
    }
}
