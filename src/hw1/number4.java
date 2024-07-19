package hw1;

public class number4 {
	
	public static void main(String[] args) {
		double a = 3.1415;
		double radius = 5;
		double length = (radius * 2) * a;
		double area = (radius * radius) * a;
		
		System.out.printf("圓周長為 %.2f%n", length);
		System.out.printf("圓面積為 %.2f%n", area);
	}

}
