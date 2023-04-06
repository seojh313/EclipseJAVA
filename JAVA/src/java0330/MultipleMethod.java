package java0330;

public class MultipleMethod {
	public static double volume(int n, int h) {
		double p = 3.14 * n * n * h;
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v = volume(6,8);
		/*
		 * double n = 6;
		 * double h	= 8;
		 * double v =volume(n,h);
		 * System.out.println("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f" r,h,v);	
		 * */
		System.out.println(v);
	}

}
