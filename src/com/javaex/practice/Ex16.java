package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		//문제16번: 숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하세요. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <=num; i++) {
			if (i%5==0) {
				sum=sum+i;
				
			}
		}
		//	몫
		System.out.println("5의 배수의 개수: "+num/5);
		//	합계
		System.out.println("5의 배수의 합: "+sum);
		
		
		sc.close();
		
	}

}
