package StriversSDESheetKnowBasicMaths;

import java.util.Scanner;

public class CountDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = countDigits(num);
        System.out.println(ans+"   Count of the digits");
        int ans2 =countDigDivByN(num);
        System.out.println("countDigDivByN = " + ans2);
    }

    static int countDigits(int num){
     int count= 0 ;
     while(num > 0){
         num =num /10;
         count++;
     }
        
        return count;
    }

    static int countDigDivByN(int n){
        int x = n;
        int count=0 ;

        while(x != 0 ){
            int rem = x % 10;
            if(rem != 0 && n % rem == 0){
                count++;
            }
            x = x/10;
        }
        return count;
    }
}

