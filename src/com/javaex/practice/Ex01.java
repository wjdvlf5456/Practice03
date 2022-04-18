package com.javaex.practice;

public class Ex01 {
	
	public static void main(String[] args) {
		
		
		//문제1번: 아래의 출력결과를 에상하여 작성하세요
		
		/*
		예상
		while문
		index=0
		index=1
		index=2
		
		""사이에 들어가면 문자가 되기 때문에 변수명이 들어가도 변수값으로 나오지 않고 문자로 나온다.
		*/

		System.out.println("while문");
		int index = 0;
		while (index < 3) {
			System.out.println("index=" + index);
			index++;
		}
		
		/*
		예상
		for문
		order=0
		order=1
		order=2
		
		""사이에 들어가면 문자가 되기 때문에 변수명이 들어가도 변수값으로 나오지 않고 문자로 나온다.
		*/
		System.out.println("for문");
		for (int order = 0; order < 3; order++) {
			System.out.println("order=" + order);
			
		}
		
		
		
		
		
	}

}
