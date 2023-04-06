package java0406;
//자판기만들기
//메뉴 출력 1.사이다 2. 콜라 3.환타 4.제로콜라
//무엇을 주문하시겠습니까? 번호입력
//번호 가 나왔습니다.
import java.util.Scanner;

public class Ex03 {
	public static void japangi(int N) {
		if(N==1) {
			System.out.println("사이다가 나왔습니다.");
		}
		else if(N==2) {
			System.out.println("콜라가 나왔습니다.");
		}
		else if(N==3) {
			System.out.println("환타가 나왔습니다.");
		}
		else if(N==4) {
			System.out.println("제로콜라가 나왔습니다.");
		} else {
			System.out.println("해당 번호는 메뉴에 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메뉴 : 1.사이다 2.콜라 3.환타 4.제로콜라");
		System.out.println("무엇을 주문하시겠습니까?");
		System.out.println(" 번호를 눌러주세요.");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		japangi(number);
	}

}
