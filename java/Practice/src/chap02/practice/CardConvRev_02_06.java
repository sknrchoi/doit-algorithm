package chap02.practice;

import java.util.Scanner;

// 연습문제 2-6
// 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하기
class CardConvRev_02_06 {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while(x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i -1];
            d[digits - i - 1] = temp;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); 
        int no;
        int cd;
        int dno;
        char[] cno = new char[32];
         
        System.out.println("10진수를 기수 변환합니다.");

        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = stdIn.nextInt();
        } while (no < 0);

        do {
            System.out.print("어떤 진수로 변환할까요? (2~36) : ");
            cd = stdIn.nextInt();
        } while (cd < 2 || cd > 36);

        dno = cardConv(no, cd, cno); // 정수 no를 기수 cd 진수로 변환

        System.out.print(cd + "진수로는 ");
        for (int i = 0; i < dno; i++) { // 아랫자리부터 차례로 나타냄
            System.out.print(cno[i]);
        }
        System.out.println("입니다.");

    }
}