package hw2;

public class Q1 {
	
	public static void main(String[] args) {
		
		// Q1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for(int num = 2 ; num <= 1000 ; num += 2) {
			sum += num; 
		}
		System.out.println("1~1000的偶數和為" + sum);
		
		System.out.println(); // 換行
	}
}
