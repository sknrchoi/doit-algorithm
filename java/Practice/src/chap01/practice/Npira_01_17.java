package chap01.practice;

import java.util.Scanner;

// 연습문제 1-17
// 아래를 향상 n단의 숫자 피라미드 출력하기

class Npira_01_17 {
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n-i); k++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= ((i - 1)*2 + 1); j++){
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단의 숫가 피라미드 입니까? : ");
			n = scanner.nextInt();
		} while (n <= 0);
		
		npira(n);
	}

}
