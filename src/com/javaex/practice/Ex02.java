package com.javaex.practice;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//문제2번: 아래의 출력결과를 예상하여 작성하세요.
		
		int x,y;
		for (x=0; x<4; x++) {
			for (y=0; y<2; y++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		예상
		
		y는 0부터 1까지 만 출력되고 x는 0부터 3까지만 출력된다.
		그럼 "*"이 2번출력되고 나서 **이 4번 아래로 출력되니
		**
		**
		**
		**
		이 나올 것이다.
		
		 */
	}

}
