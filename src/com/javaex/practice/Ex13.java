package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		
		
		//문제13번: 숫자를 1개 입력받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		//	조건문
		for (int i = 1; i<=num; i++) {
				sum=sum+i;			
		}
		System.out.println("합계: "+sum);
		
		sc.close();
	}

}
