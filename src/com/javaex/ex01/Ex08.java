package com.javaex.ex01;
import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args){

		String name;
        int age;
        float zl;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("이름을 입력해주세요");
        System.out.printf("이름: ");
        name = sc.next();
       
        System.out.printf("나이를 입력해주세요");
        System.out.printf("나이: ");
        age = sc.nextInt();
        
        System.out.printf("키를 입력해주세요");
        System.out.printf("키: ");
        zl = sc.nextFloat();
        
        System.out.printf("당신의 이름은 %s ",name);
        System.out.printf("나이는 %d",age);
        System.out.printf("키는 %.1f 입니다.\n",zl);

	}

}
