package StriversSDESheetKnowBasicMaths;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int x = sc.nextInt();
        int dummy = x;
        int y= ArmStr(x);
        if(dummy == y){
            System.out.println("its ArmStrong = " + y);
        }
        else {
            System.out.println("its not ArmStrong = " + y);
        }
    }
    static int ArmStr(int n){
        int value = 0;
        while(n != 0){
            int rem = n % 10;
            int cube = rem*rem*rem;
            value = value+cube;
            n/=10;
        }
        return value;
    }
}
