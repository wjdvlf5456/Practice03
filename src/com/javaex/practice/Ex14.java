package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		
		//문제14번: 13번 문제에 계산식이 표시되도록 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <=num; i++) {
			sum=sum+i;
			System.out.print(i);		//--> 마지막에는 +가 없어야 함
			if(i!=num) {
			System.out.print("+");
			}
		}
		System.out.println();
		System.out.print("합계: "+sum);
		
		sc.close();
		
	}

}
