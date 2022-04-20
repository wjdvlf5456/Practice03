package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		// 조건문 1
		for (int i = 1; i <= num; i++) {

			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println("");
		}
		// 조건문 2
		for (int i = 2; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

		sc.close();

	}

}
