package hw2;

public class Q3 {
	
	public static void main(String[] args) {
		
		// Q3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int count = 1;
		int num = 1;
		
		while(num <= 10) {
			count *= num;
			num++;
		}
		System.out.println("1~10的連乘積為" + count);
	}
}
