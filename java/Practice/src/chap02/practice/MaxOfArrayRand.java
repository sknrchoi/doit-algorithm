package chap02.practice;

import java.util.Random;

// 연습문제 2-1
// 사람수와 키를 난수로 생성하도록 실습 2-5 수정하여 프로그램 작성하기

public class MaxOfArrayRand {
    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num = rand.nextInt(10) + 1; // 사람수를 10명 이내로 난수 생성
        System.out.println("사람 수 : " + num);

        int[] height = new int[num]; // 요솟수가 num인 배열을 생성

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90); // 요소의 값을 난수로 결정
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}