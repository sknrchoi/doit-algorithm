package chap01;

class Max4m {
	// 네 값의 최댓값을 구하여 반환한다.
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max(3,2,1,0) = " + max4(3, 2, 1, 0));
		System.out.println("max(2,3,0,1) = " + max4(2, 3, 0, 1));
		System.out.println("max(1,0,3,2) = " + max4(1, 0, 3, 2));
		System.out.println("max(2,1,0,3) = " + max4(2, 1, 0, 3));
	}
}
