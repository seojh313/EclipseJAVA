package java0406;

public class If01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			turnOn(30);
			turnOn(19);
	}
	public static void turnOn(int temperature) {
		if (temperature >25) {
			System.out.printf("현재 온도 %d도, 에어컨가동.",temperature);
		}
	}
	

}
