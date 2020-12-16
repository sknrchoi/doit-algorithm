package chap01.practice;
// 연습문제 1-4

class Median {
	static int med3(int a, int b, int c) {
		/*if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;*/
		
		// 효율성이 떨어지는 이유는? or조건에 의해서 후자 조건에 부합하는지 체크해야하기 때문에
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("median(3,2,1) = " + med3(3, 2, 1));
		System.out.println("median(3,2,2) = " + med3(3, 2, 2));
		System.out.println("median(3,1,2) = " + med3(3, 1, 2));
		System.out.println("median(3,2,3) = " + med3(3, 2, 3));
		System.out.println("median(2,1,3) = " + med3(2, 1, 3));
		System.out.println("median(3,3,2) = " + med3(3, 3, 2));
		System.out.println("median(3,3,3) = " + med3(3, 3, 3));
		System.out.println("median(2,2,3) = " + med3(2, 2, 3));
		System.out.println("median(2,3,1) = " + med3(2, 3, 1));
		System.out.println("median(2,3,2) = " + med3(2, 3, 2));
		System.out.println("median(1,3,2) = " + med3(1, 3, 2));
		System.out.println("median(2,3,3) = " + med3(2, 3, 3));
		System.out.println("median(1,2,3) = " + med3(1, 2, 3));
	}
}