package java0413;

import java.util.Scanner;

// 회원등급을 나눈다. 
// 회비, 직업
// 정회원- 3만원이상, 일반
// 준회원- 1만원이상, 학생
//평생회원- 5만원이상, 학생
//비회원- 
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생과 일반중 해당되는 직업을 입력하세요");
		System.out.println("학생인가요? 일반인가요?");
		b = scan.next();
		System.out.println("회비를 입력하세요");
		a = scan.nextInt();
									//b=="학생" 은 b와 "학생"의 주솟값이 묻는것. 
		if (a>=5 && b.equals("학생")){ // 숫자, 문자열 같이 논리연산하는 방법 string형변수.equals("값") -> true or false 값나옴
			System.out.println("평생회원입니다.");
		}
		else if(a>=3 && b.equals("일반")) {
			System.out.println("정회원입니다.");
		}
		else if(a>=1 && b.equals("학생")) {
			System.out.println("준회원입니다.");
		}
		else {
			System.out.println("비회원입니다.");
		}
	}

}
