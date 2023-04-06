package java0330;

public class ZerotoTenRandom {

	public static int Ran() {
		double x = 10*Math.random();
		int temp = (int)x;
		return temp+1; //최소 1값
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R =Ran(); //입력변수 없이 사용 하는 ㅁㅅㄷ
		System.out.println("1부터 10까지 랜덤수 : " + R);
	}

}
