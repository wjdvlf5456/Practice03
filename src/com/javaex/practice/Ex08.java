package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		
		//문제8번: 구구단을 세로로 출력하세요
		
		
		for (int i=1; i<=9; i++) {
			
			for (int j=2; j<=9; j++) {
				
				//출력되는 결과값
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println(); 
		}

	}

}
