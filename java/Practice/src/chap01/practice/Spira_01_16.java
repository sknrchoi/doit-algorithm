package chap01.practice;

import java.util.Scanner;

// 연습문제 1-16
// n단의 피라미드를 출력하는 메서드 작성

class Spira_01_16 {

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n-i); k++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= ((i - 1)*2 + 1); j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("몇 단의 피라미드 입니까? : ");
			n = scanner.nextInt();
		} while (n <= 0);
		
		spira(n);
	}

}
