package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		//문제11번: 입력받은 숫자가 홀수면 입력 값까지 홀수의 합을 출력합니다. 짝수면 짝수의 합; 
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int num = sc.nextInt();
		int sum = 0;
		
		//	짝수
		if (num % 2 == 0) {
			for (int i = 1; i <= num; i++) {
				sum = sum + ++i;
			}
		//	홀수
		} else if (num % 2 != 0) {
			for (int i = 0; i <= num; i++) {
				sum = sum + ++i;
			}

		}
		System.out.print("결과값: " + sum);

		sc.close();

	}

}
