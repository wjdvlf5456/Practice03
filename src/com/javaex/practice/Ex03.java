package com.javaex.practice;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//문제3번: 아래의 출력결과를 예상하여 작성하세요.
		
		int x,y;
		for (x=0; x<4; x++) {
			for (y=2; y >=0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		예상
		
		x는 0,1,2,3이 들어가고 y는 2,1,0이 들어가니 4곱하기3으로
		***
		***
		***
		***
		이 나올 것이다.
		 */
		
	}

}
