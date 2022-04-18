package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		//문제12번: 숫자1개를 입력받아 팩토리얼 값을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		int sum=1;				
		
		//	조건문
		for (int i = 1; i <=num; i++) {
			sum=sum*i;
			
		}
		System.out.println("결과값: "+sum);
		
		sc.close();
		
	}

}
