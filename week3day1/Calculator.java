package week3day1;

public class Calculator {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("result " + c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("result " + d);

	}

	public void multiply(int z, int x) {
		int h = z * x;
		System.out.println("result " + h);

	}

	public void multiply(double z, int r) {
		double h = z * r;
		System.out.println("result " + h);
	}

	public void subtract(int q, int r) {
		int h = q - r;
		System.out.println("result " + h);
	}

	public void subtract(double q, double r) {
		double h = q - r;
		System.out.println("result " + h);
	}

	public void divide(int q, int r) {
		int h = q / r;
		System.out.println("result " + h);
	}

	public void divide(int q, double r) {
		double h = q - r;
		System.out.println("result " + h);
	}

	public static void main(String[] args) {

		Calculator all = new Calculator();

		all.add(2, 1);
		all.add(3, 4, 5);
		all.divide(4, 2.5);
		all.divide(5, 5);
		all.multiply(34.5, 4);
		all.multiply(5, 6);
		all.subtract(9.6, 5.60);
		all.subtract(100, 98);
	}

}
