package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		// 문제10번: 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		
		int max=0;
		
		for (int i = 1; i <=5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if (num>max) {
				max=num;
			}
		}
		System.out.println("최대값은 "+max+" 입니다.");
		
		sc.close();
	}

}
