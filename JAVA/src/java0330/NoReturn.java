package java0330;

public class NoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buy(); //a
		boil(); //c
		put(); //b
		eat(); //d
	}
	private static void buy() { //a
		// TODO Auto-generated method stub
		System.out.println("산다");
	}

	private static void put() { //b
		// TODO Auto-generated method stub
		System.out.println("넣는다");
	}

	private static void boil() { //c
		// TODO Auto-generated method stub
		System.out.println("끓인다");
	}

	private static void eat() { //d
		// TODO Auto-generated method stub
		System.out.println("먹는다");
	}
}
