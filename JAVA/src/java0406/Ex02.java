package java0406;
//잔액이 충분하다면 
//잔액이 충분하지않다면
import java.util.Scanner;

public class Ex02 {
	public static String money(int M) {
		if(M>100000) {
			System.out.println("잔액이 충분하지않습니다.");
		} else if (M<=100000) { // else만있어도 가능
			System.out.println(M + "원 출금완료");
		} return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		money(120000);
		money(1230000);
		money(49905);
		
	}
//	public static int withdraw(int balance, int money) {
//		if(balance >= money) {
//			System.out.println(money + "원 인출됨.");
//			balance -= money;
//		} 
//		else {
//			System.out.println("잔액이 부족합니다.");
//		} 
//		return balance;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		int myMoney = 10000;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("인출액 입력");
//		int money = scan.nextInt();
//		myMoney = withdraw(myMoney,2000); //--- 1 입력받기
	
//		int myMoney = 10000;
//		myMoney = withdraw(myMoney,2000);
//		System.out.println("제 잔액은 " + myMoney + "원 입니다."); // ---- 2
//		
//	} // 교수님 코드

}
