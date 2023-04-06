package java0406;
// 0~23시까지 입력
// 아침7~8/점심12~13/저녁18~19
public class If02 {
	
	public static void timeWhat(int T) {
		if(T>=7 && T<=8) { //and 연산
			System.out.printf("%d는 아침식사시간입니다.\n",T);
		} else if(T==12 || T== 13) {
			System.out.printf("%d는 점심식사시간입니다.\n",T);
		} else if(T==18 | T== 19) {
			System.out.printf("%d는 저녁식사시간입니다.\n",T);
		} else{
			System.out.printf("%d는 식사시간이 아닙니다.\n",T);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timeWhat(12);
		timeWhat(15);
		timeWhat(7);
	}
	
//	public static String haksik(int hour) {
//		if (hour >=7 && hour <=8) {
//			return "아침";
//		}
//		else if (hour >=12 && hour <=13) {
//			return "점심";
//		}
//		else if (hour >=18 && hour <=19) {
//			return "저녁";
//		}
//		return "";
//	} //---- 1
//	public static String haksik(int hour) {
//		if (hour <12) {
//			return "아침";
//		}
//		else if (hour <17) {
//			return "점심";
//		}
//		else if (hour <21) {
//			return "저녁";
//		}
//		return "";
//	} //---- 2 if문의 특성, 조건이 맞게되면 아래 코드실행X
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String bob ="";
//		
//		bob=haksik(8);
//		System.out.println(bob);
//	} //교수님 코드
}
