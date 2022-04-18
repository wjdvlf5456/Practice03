package com.javaex.practice;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//문제6번: 1에서 100까지의 수에서 5의 배수이면서 7의 배수인 수를 출력하세요.
		
		/*
		문제풀이
		
		1에서 100까지 라고 정해진 수가 있기 때문에 for문을 사용해준다.
		그리고 for문안에 if문으로 %5, %7을 사용해준다.
		 */
		
		int num;
		
		for (num=1; num<=100; num++) {
			if (num%5==0) {
				System.out.println(num);
			} else if(num%7==0) {	
				System.out.println(num);
			} else {
				
			}
		}
		
		
	}

}
