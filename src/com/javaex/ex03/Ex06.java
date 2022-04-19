package com.javaex.ex03;
import java.util.Scanner;
public class Ex06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("점수를 입력하세요 ");
        int A = scan.nextInt();
        
        if(A%3==0) {
        	System.out.printf("입력하신 수는 3의 배수가 맞습니다.");
        } else {
        	System.out.println("입력하신 수는 3의 배수가 아닙니다.");
        }

    }

}