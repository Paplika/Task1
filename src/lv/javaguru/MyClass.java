package lv.javaguru;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int imax = 0;
        for (int i=0; i<n; i++){
            int nextnumber = scanner.nextInt();
            if (nextnumber>imax){
                imax = nextnumber;
            }
        }
       System.out.println(" max number is " + imax);
    }
}
