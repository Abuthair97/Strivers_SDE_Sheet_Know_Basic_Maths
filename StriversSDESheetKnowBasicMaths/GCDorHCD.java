package StriversSDESheetKnowBasicMaths;

import java.util.Scanner;

public class GCDorHCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = findGcd(a,b);
        System.out.println("GCD = " + ans);
    }
    static  int  findMini(int a , int b ){
        if(a < b){
            return a;
        }
        else {
            return b;
        }
    }
    static  int findGcd(int a, int b){
        int gcd=0;
        for(int i = 1; i<= findMini(a,b);i++){
            if(a % i == 0 &&  b % i == 0){
                gcd =i;
            }
        }
        return gcd;
    }
}
