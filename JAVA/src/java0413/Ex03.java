package java0413;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner scan = new Scanner(System.in);
		System.out.println("해당 월 을 입력하세요");
		m = scan.nextInt();
		
		if(m>12 || m==0) {
			System.out.println("해당안함");
		} else if(m==12) {
			System.out.println("겨울");
		} else if(m>=9 && m<=11) {
			System.out.println("가을");
		} else if (m>=6) {
			System.out.println("여름");
		} else if (m>=3) {
			System.out.println("봄");
		} else {
			System.out.println("겨울");
		}
	}
}
