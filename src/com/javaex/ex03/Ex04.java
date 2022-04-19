package com.javaex.ex03;
import java.util.Scanner;

public class Ex04{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간 : ");
		
		int time = sc.nextInt();
		
		int A;
		int B=0;
		
		
		 if (time <= 8) {
			 A=10000;
			 B = A * time;
	        } else{
	        	A=10000;
	            B = 8*A+(time-8)*12000;
	        }

	 System.out.println("임금은 " + B + "원 입니다");

	}
   }

