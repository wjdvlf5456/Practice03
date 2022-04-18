package com.javaex.practice;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//문제4번: 아래의 출력결과를 예상하여 작성하세요.
		
		for (int i=1; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("================");
		
		for (int i=10; i>0; i=i-2) {
			System.out.println(i);
		}
		
		/*
		에상
		
		위에 for문은 i의 경우가 4이고 println이라 아래로 내려가므로
		1
		2
		3
		4
		가 나올 것이고
		
		아래 for문은 i의 경우는 8,6,4,2가 나올 수 있으니
		8
		6
		4
		2
		가 나올 것이다.
		 */
		
		/*
		정답
		
		문자인 ================를 포함하고 
		초기값인 10도 들어갈 수 있으므로 
		10
		8
		6
		4
		2
		가 된다.
		 */
		
	}

}
