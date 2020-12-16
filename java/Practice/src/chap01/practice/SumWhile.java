package chap01.practice;

import java.util.Scanner;

// 연습문제 1-6
// 실습 1-4에서 while문이 종료될 때 변수 i 값이 n+1이 됨을 확인하기
class SumWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0; // 합
		int i = 1;
		
		while (i <= n) { // i가 n이하면 반복합니다.
			sum += i;	 // sum에 i를 더합니다.
			i ++;		 // i값은 1만큼 증가시킵니다.
		}
		
		System.out.println("i의 값은 " + i + "입니다.");
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
