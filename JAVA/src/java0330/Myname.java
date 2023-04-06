package java0330;

public class Myname {
							//전달파라미터,인수,매개변수
	public static int square(int num) { //메소드 square 파라미터int형 num  
		
		
		int value = num * num;
		//float value = num * num;
		
		return value; // 반환형 int
		//return (int)value;
		
		
	} // 메소드의 정의 부

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "서지환";
		//String b ="2301110334"; 문자열로 학번표시하기
		long b = 2301110334L;
		int c = 26;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a +", "+ b + ", " + c);
		System.out.printf("%s,%d,%d\n",a,b,c);
		
		int m = square(3); //메모리 공간에 3을 저장하고 square num 에 복사, 이후 복사된 num값을 연산 return 값 9
		int n = square(4);
		
		System.out.println("첫번째: " + m);
		System.out.println("두번째: " + n);
		// 입력파라미터 값도 변수, m,n값을 저장하고 반환
		
		double x = Math.abs(-9.81); //절댓값 반환하는 math.abs함수 호출 우클릭 declaration 참조
		System.out.println(x);
		int y = Math.max(3, 7);
		System.out.println(y);
	}
	 /* 매개변수와 파라미터는 _의 또다른 이름이다. A:변수 , 인수, 입력변수
	  *
	  */
}
