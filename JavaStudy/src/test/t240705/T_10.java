package test.t240705;

import java.util.Scanner;

public class T_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("문자열 : ");
            String str = sc.next();
            
            if (str.isEmpty()) {
                System.out.println("입력된 문자열이 없습니다. 다시 입력해주세요.");
                continue; // 다시 반복문의 처음으로 돌아갑니다.
            }
            
            System.out.println("문자 : ");
            char target = sc.next().charAt(0);
            
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    count++;
                }
            }
            
            System.out.println("포함된 갯수 : " + count);
            System.out.println("더 하시겠습니까? (y/n) : ");
            
            char response = sc.next().charAt(0);
            if (response == 'n' || response == 'N') {
                break; // 반복문을 종료합니다.
            } else if (response != 'y' && response != 'Y') {
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                break; // 잘못된 입력이면 프로그램 종료
            }
        }
        
        sc.close();
    }

}
