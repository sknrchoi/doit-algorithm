package chap02.practice;

import java.util.Scanner;

// 연습문제 2-7
// 기수 변환 과정을 자세히 나타내는 프로그램 작성
/*
    10진수를 기수 변환합니다.
    변환하는 음이 아닌 정수 : 9
    어떤 진수로 변환할까요? (2~36) : 2
    2|     9 
    +-------
    2|     4 ... 0
    +-------
    2|     2 ... 0
    +-------
        0 ... 1
    2진수로는 1001입니다.
 */
class CardConvDetail_02_07 {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        do {
            if (digits == 0) {
                System.out.printf("%d|%6d \n", r, x);
                System.out.println(" +-------");
            }
            else if (x / r != 0) {
                System.out.printf("%d|%6d ... %d\n", r, x, x % r);
                System.out.println(" +-------");
            }
            else {
                System.out.printf("%8d ... %d\n", x / r , x % r);
            }
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

        dno = cardConv(no, cd, cno);

        System.out.print(cd + "진수로는 ");
        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
        System.out.println("입니다.");
    }
}