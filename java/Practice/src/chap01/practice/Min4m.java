package chap01.practice;
// 연습문제 1-3

class Min4m {
	// 네 값의 최솟값을 구하여 반환한다.
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min(3,2,1,0) = " + min4(3, 2, 1, 0));
		System.out.println("min(2,3,0,1) = " + min4(2, 3, 0, 1));
		System.out.println("min(1,0,3,2) = " + min4(1, 0, 3, 2));
		System.out.println("min(2,1,0,3) = " + min4(2, 1, 0, 3));
	}

}
