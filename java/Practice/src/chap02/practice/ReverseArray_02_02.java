package chap02.practice;

import java.util.Arrays;
import java.util.Scanner;

// 연습문제 2-2
// 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램 작성

class ReverseArray_02_02 {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int idx1 = i;
            int idx2 = a.length - i - 1;
            System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
            swap(a, idx1, idx2);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdId.nextInt(); // 요솟수

        int[] x = new int[num]; // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdId.nextInt();
        }

        reverse(x);

        System.out.println("역순 정렬을 마쳤습니다.");
    }
    
}