package chap01.practice;

// 연습문제 1-12
// 왼쪽과 위쪽에 곱하는 수가 있고 구분선이 있는 곱셈표를 작성

public class Multi99TableWithSeperator_01_12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i == 1) System.out.printf("   |");
			System.out.printf("%3d", i);
		}
		
		System.out.println();
		System.out.println("---+---------------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++) System.out.printf("%3d", i * j);
			System.out.println();
		}
	}

}
