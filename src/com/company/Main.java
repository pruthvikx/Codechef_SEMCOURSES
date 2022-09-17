package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for(int i=0;i<testCase;i++){
            int course = scan.nextInt();
            int chapter = scan.nextInt();
            int units = scan.nextInt();
            System.out.println(course * chapter * units);
        }
    }
}
