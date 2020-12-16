package chap01.practice;

import java.util.Scanner;

// 연습문제 1-10
// 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램 작성하기
// 단, b에 입력한 값이 a 이하면 b값을 다시 입력한다.
public class DoWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		
		System.out.print("a의 값 : "); a = stdIn.nextInt();
		System.out.print("b의 값 : "); b = stdIn.nextInt();
				
		while (a >= b) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값 : "); b = stdIn.nextInt();
		}
		
		System.out.println("b - a는 " + (b-a) + "입니다.");
		
	}

}
