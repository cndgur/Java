package test_200704;

import java.util.Scanner;

public class T_07 {

	String str;
    System.out.print("문자열 : ");
    str = sc.next();
    
    System.out.print("문자 : ");
    char ch = sc.next().charAt(0);
    
    char[] chArr = new char[str.length()];
    for(int i =0; i < chArr.length; i++) {
       chArr[i] = str.charAt(i);
    }
    int count = 0;
    System.out.println(str + "에" + ch + "가 존재하는 위치(인덱스) : ");
    for(int i=0; i < str.length(); i++) {
       if(str.charAt(i) == ch) {
          System.out.print(i + " ");
          count++;
     
    
    System.out.println(ch + "개수 : " + count);  
    }
       
    }
}
