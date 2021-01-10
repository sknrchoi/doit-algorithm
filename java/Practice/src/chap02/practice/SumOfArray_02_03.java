package chap02.practice;

import java.util.Scanner;

// 연습문제 2-3
// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성

class SumOfArray_02_03 {
    // 배열 a의 모든 요소의 합계를 구함
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);
        
        System.out.print("요솟수 : ");
        int num = stdId.nextInt();

        int[] x = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdId.nextInt();
        }
        
        sum = sumOf(x);
        System.out.println("배열 요소의 합계 : " + sum);
    }
}