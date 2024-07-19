package hw2;

public class Q2 {

	public static void main(String[] args) {
		
		// Q2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int count = 1;
		for(int num = 1 ; num <= 10 ; num++) {
			count *= num;
		}
		System.out.println("1~10的連乘積為" + count);
	}
}
