package chap01.practice;

import java.util.Scanner;

// 연습문제 1-8
// 1부터 10까지의 합을 (1 + 10)*5와 같은 방법(가우스의 덧셈)으로 구하는 프로그램 작성하기
class GaussSum {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();
		int sum = 0; // 합
		
		sum = (1 + n) * n / 2;

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
