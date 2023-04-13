package java0413;

import java.util.Scanner;

// 자동차는 악셀/ 브레이크로 이루어져 있다.
// 초기속도 설정.
// 증가시키기
// 속도는 음수 불가, 100을 넘길시 속도증가 하지않게
public class CarMake {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("현재속도를 입력하세요\n:");
		int p = scan.nextInt();
		CarSpeed(p);
		
	}
	public static void CarSpeed(int Speed) {
		if(Speed==0) {
			Speed+=50;
			System.out.printf("속도를 올립니다. 현재속도 %d",Speed);
		} else if(Speed>=100) {
			System.out.println("과속. 중지");
		}
	}

}



