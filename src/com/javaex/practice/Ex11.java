package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		
		//	문제풀이: %2와 while을 사용해준다.
		
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i<=num; i++) {
			
			if (i%2==0) {
				sum=sum+i;
				
			} else {
				sum=sum+i;
				
			} 
			System.out.print("결과값: "+sum);
			
		}
		
		
		
		sc.close();
		
	}

}
