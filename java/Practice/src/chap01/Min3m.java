package chap01;

class Min3m {
	// 세 값의 최솟값을 구하여 반환한다.
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min(3,2,1) = " + min3(3, 2, 1));
		System.out.println("min(2,1,3) = " + min3(2, 1, 3));
		System.out.println("min(1,3,2) = " + min3(1, 3, 2));
	}
}
