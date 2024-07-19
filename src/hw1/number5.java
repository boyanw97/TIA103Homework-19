package hw1;

public class number5 {

	public static void main(String[] args) {
		double p = 1500000;
		double r = 0.02;
		double n = 10;
		double sum = p * Math.pow(1 + r, n);
		
		System.out.printf("10年後本金+利息一共為 %.2f%n", sum);
	}

}
