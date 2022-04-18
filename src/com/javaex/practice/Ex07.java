package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//문제7번: 숫자를 입력받아 숫자만큼 가로세로에 입력한 수가 나오게 하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int x = sc.nextInt();
		
		for (x=1; x<=x; x++) {
			
			for (int y=1; y<=x; y++) {
				System.out.print(x);
			}
			System.out.println();
		}
		sc.close();
		
	}

}
