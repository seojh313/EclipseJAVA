package java0413;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇월 입니까");
		m = scan.nextInt();
		
		switch(m) 
		{
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니ㅏㄷ.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름입");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을ㅇ");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("겨울입니다");
				break;
		}
		
	}

}
