package com.javaex.ex03;
import java.util.Scanner;
public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("근무시간 : ");
        int time = scan.nextInt();

        int A;
        int B;      

        if (time > 8) {
        	A =10000;
        	B=0;
            int C = time - 8;
            B = (A * 8) + (int)(C * A * 1.5);
        } else {
        	A =10000;
        	B=0;
            B = A * time;
        }

        System.out.println("임금은 " + B + "원 입니다");

    }

}