package StriversSDESheetKnowBasicMaths;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean ans = isPrime(x);
        if(ans == true){
            System.out.println("prime");
        }
        else{
            System.out.println("notPrime");
        }
    }
     static boolean isPrime(int n){
         for (int i = 2; i < n ; i++) {
             if(n % i == 0){
                 return false;
             }

         }
         return true;
    }
}
