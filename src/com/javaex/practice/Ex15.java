package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		
		//문제15번: 숫자를 1개 입력받아 입력한 수의 약수를 모두 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i = 1; i<=num; i++) {
			
			//약수 조건문
			if (num%i==0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
