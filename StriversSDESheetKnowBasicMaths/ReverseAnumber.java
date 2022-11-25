package StriversSDESheetKnowBasicMaths;

import java.util.Scanner;

public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = revNum(num);
        System.out.println(ans +" revNumber");
    }
    static  int revNum(int num){
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            result= result*10+rem;
            num /=10;
        }

        return  result;
    }
}
