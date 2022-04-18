package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
		
		public static void main(String[] args) {
			
			//문제7번: 숫자를 입력받아 숫자만큼 가로세로에 입력한 수가 나오게 하시오
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("숫자를 입력하세요");
			
			int num = sc.nextInt();
			
			for (int i=1; i<=num; i++) {
				for (int j = 1; j<i ; j++) {
					System.out.print(i);
				}
				System.out.println(i);
			}
			
			sc.close();
		}

}
