package java0330;

public class SquareMethod {
	
	public static int square(int n) {
		
		int S = n*n;
		
		return S;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = square(7);
		
		System.out.println(t);
		System.out.println("한변의 길이가 "+7+"인 사각형의 넓이는 "+t);
	}

}
