package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int odd = 64;
		System.out.println("=================================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("=================================");

		while (true) {
			System.out.print(">>");
			int num = sc.nextInt();
			if (num < odd) {
				System.out.println("더 높게");
			} else if (num > odd) {
				System.out.println("더 낮게");

			} else if (num == odd) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n)");
				continue;
				
			}	
			sc.close();
		}

	}
}
/*				while (true) {

					if (alphabet == "n") {
						end = alphabet;
						System.out.println("=================================");
						System.out.println("\t[숫자맞추기게임 시작]");
						System.out.println("=================================");
						continue;
					} else if (alphabet == "y") {
						end = alphabet;
						System.out.println("=================================");
						System.out.println("\t[숫자맞추기게임 종료]");
						System.out.println("=================================");
						break;}*/