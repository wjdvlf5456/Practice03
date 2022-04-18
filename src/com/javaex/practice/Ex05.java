package com.javaex.practice;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//문제5번: 아래의 출력결과를 예상하여 작성하세요
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if (i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}
		
		/*
		예상
		
		while문에서 flag라는 변수는 true가 되어있기 때문에 실패가 나오기 전까지는 다 맞는 결과이므로 계속 출력이 된다. 
		근데 i의 값이 5이상이 되면 false로 바뀌기 때문에 출력이 되지 않는다.
		따라서 출력값은
		1
		2
		3
		4
		일 것이다.
		 */
		
		/*
		정답
		
		4가 입력된 후 i값은 5이므로 5까지 나온 후 멈춘다. 
		1
		2
		3
		4
		5
		가 정답이다.
		 */
		
		
	}

}
