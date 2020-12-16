package chap01.practice;

import java.util.Scanner;

// 연습문제 1-11
// 양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성하기
public class DigitPrint {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n; // 정수값
		int i = 0; // 자릿수
		
		do {
			System.out.print("양의 정수 : ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		while (n != 0) {
			n /= 10;
			i++;
		}
		System.out.println("그 수는 " + i + "자리입니다.");
	}

}
