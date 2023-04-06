package java0406;

public class Ex01 {
	
	public static int inchul(int i) {
		System.out.println(i + "가 인출되었습니다.");
		return i;
	}
//	public static double lucky(double money) {
//		return money * 1.2;
//	} ---- 1
//	public static int  withdraw(int balance, int money) {
//		System.out.println(money + "원 인출됨");
//		return balance - money;
//		
//	} ---- 2

	public static void main(String[] args) {
		int J = 2000;
		System.out.println("잔고는" + (J-inchul(40)));
	}
//	public static void main(String[] args) {
//		lucky(10000);
//		lucky(10000);
//		lucky(10000);
//		lucky(10000);
//	} ---- 1
	
//	public static void main(String[] args) {
//		int myMoney = 100000;
//		int money2 = withdraw(myMoney,10000);
//		System.out.println(money2 + "원 남음");
//		
//	} ---- 2
	

}
