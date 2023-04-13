package java0413;

public class Ternary_operator { //삼항연산자
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score = 88;
//		String result = (score>=60)? "합격":"불합격";
//		
//		System.out.println(result);
		printResult(13);
		printResult(6);
	}
	public static void printResult(int n) {
		String result = (n%2==0)? "짝":"홀" ;
		System.out.printf("정수 %d는 %s입니다.\n",n,result);
	}

}
