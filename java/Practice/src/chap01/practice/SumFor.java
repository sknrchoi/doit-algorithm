package chap01.practice;

import java.util.Scanner;

// 연습문제 1-7
// n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램 작성하기
class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();

		int sum = 0; // 합
		
		for (int i=1; i <= n; i++) {
			if (n == 7) {
				System.out.print(i);
				if (i < n) System.out.print(" + ");
				else System.out.print(" = ");
			}
			
			sum += i; // sum에 i를 더합니다.
		}
		
		if (n == 7) System.out.print(sum);
		else System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
