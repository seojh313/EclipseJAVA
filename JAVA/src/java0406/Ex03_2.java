package java0406;
//자판기만들기
//메뉴 출력 1.사이다 2. 콜라 3.환타 4.제로콜라
//무엇을 주문하시겠습니까? 번호입력
//번호 가 나왔습니다.
import java.util.Scanner;

public class Ex03_2 {
	public static String japangi(int N) {
		if(N==1) {
			return "사이다";
		}
		else if(N==2) {
			return "콜라";
		}
		else if(N==3) {
			return "환타";
		}
		else if(N==4) {
			return "제로콜라 나옴";
		}  
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메뉴 : 1.사이다 2.콜라 3.환타 4.제로콜라");
		System.out.println("무엇을 주문하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		System.out.println(" 번호를 눌러주세요.");
		int number = scan.nextInt();
		if (number<=0 || number>=5) {
			System.out.println("잘못입력하셨습니다.");
		}
		japangi(number);
		System.out.println(japangi(number));
	}

}