package Day1;

import java.util.Scanner;

public class PrintPrimetillEnd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        for(int i = num1 ; i <= num2; i++){
            int flag = 1;
            for(int j = 2; j*j <= i; j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }
}
