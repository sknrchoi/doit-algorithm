package chap01.practice;

import java.util.Scanner;

// 연습문제 1-9
// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메소드 sumof 구현하기
class SumOf {
	
	static int sumof(int a, int b) {
		int sum = 0;
		int init, number = 0;
		
		if (a > b) {
			init = b;
			number = a;
		} else {
			init = a;
			number= b;
		}
		
		for (int i = init; i <= number; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a와 b 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println(a + "와 " + b + "사이의 합은 " + sumof(a, b) + "입니다.");
	}

}
