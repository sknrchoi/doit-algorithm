package chap01.practice;

// 연습문제 1-13
// 덧셈 출력하는 덧셈표 작성

public class Sum99Table_01_13 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i == 1) System.out.printf("   |");
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+---------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
	}

}
