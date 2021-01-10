package chap02.practice;

import java.util.Arrays;
import java.util.Scanner;

// 연습문제 2-5
// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy작성

class ReverseCopy_02_05 {
    // x[idx1]과 x[idx2]를 교환하는 함수
    static void swap(int[] x, int idx1, int idx2) {
        int tmp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = tmp;
    }

    // b의 모든 요소를 배열 a에 역순으로 복사하는 함수
    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            swap(b, i, b.length - i - 1);
        }
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);
        
        System.out.print("배열 b 요솟수 : ");
        int num = stdId.nextInt();

        int[] b = new int[num]; // 배열 b 선언
        int[] a = new int[num]; // 배열 a 선언

        for (int i = 0; i < num; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdId.nextInt();
        }
        
        rcopy(a, b);
        System.out.println("역순으로 복사 완료");
        System.out.println(Arrays.toString(a));
    }
}