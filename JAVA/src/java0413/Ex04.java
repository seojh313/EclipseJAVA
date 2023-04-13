package java0413;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		light("Red");
		light("Yellow");
		light("Green");
		light("Blue");
		
	}
	public static void light(String color) {
		switch (color) 
		{
			case "Red" :
				System.out.println("빨간불이 켜집니다.");
				break;
			case "Yellow" :
				System.out.println("빨간불이 켜집니다.");
				break;
			case "Green" :
				System.out.println("빨간불이 켜집니다.");
				break;
			default:
				System.out.printf("에러, 잘못된 색 입력: %s\n", color);
		}
	}
}
