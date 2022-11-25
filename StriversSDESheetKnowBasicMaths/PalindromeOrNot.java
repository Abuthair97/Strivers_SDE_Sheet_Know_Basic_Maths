package StriversSDESheetKnowBasicMaths;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int dummy = x;
        int y = reversePalindrome(x);
        if(dummy == y){
            System.out.println("its Palindrome  " + y);
        }
        else{
            System.out.println("its not Palindrome  " + y);
        }
    }
    static  int reversePalindrome(int num){
    int rev = 0;
    while(num > 0 ){
        int rem= num % 10;
        rev = rev *10 +rem;
        num/=10;
    }
    return rev;
    }
}
