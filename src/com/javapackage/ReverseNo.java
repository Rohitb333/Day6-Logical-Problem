package com.javapackage;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int num = 0;
        int reversenum = 0;
        System.out.println("Enter A Number: ");
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();
        //While Loop: Logic to find out the reverse number
        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse number is: " + reversenum);
    }
}
