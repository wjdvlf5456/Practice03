package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		//문제9번: 숫자를 ₩t 사용 하여 떨어트리고 출력하시오
		
		/*
		문제풀이
		
		한바퀴를 지나고 나면 가로의 숫자들이 1씩 증가하니 참고하면 된다.
		 */
		
		for (int i=1; i<=10; i++) {
			
			for (int j=1; j<=10; j++) {
				
				System.out.print(i+(j-1)+"\t");
			}
			System.out.println();
		}

	}

}
