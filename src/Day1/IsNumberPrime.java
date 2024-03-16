package Day1;
import java.util.Scanner;
public class IsNumberPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 1; i <= n; i++){
            int flag  = 0;
            int num = scn.nextInt();
            for(int j = 2; j*j <= num; j++){
                if(num%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
}
