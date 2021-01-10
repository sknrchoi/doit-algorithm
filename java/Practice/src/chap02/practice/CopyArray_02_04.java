package chap02.practice;

import java.util.Arrays;

// 연습문제 2-4
// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성

class CopyArray_02_04 {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {5,3,7,6,2};

        System.out.println("배열 a, b");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        copy(a, b);
        System.out.println("배열 복사 완료");
        System.out.println(Arrays.toString(a));
    }
}