package com.java.LogicalProgram;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String args[])
    {
        int num = 0, revNum = 0, reminder = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        while(num != 0)
        {
            reminder = num % 10;
            revNum = revNum * 10 + reminder;
            num = num / 10;

        }
        System.out.println("Reverse of Input Number : " +revNum);

    }
}
