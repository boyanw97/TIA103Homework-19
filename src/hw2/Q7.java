package hw2;

public class Q7 {
	
	public static void main(String[] args) {
		
		// Q7.請設計一隻Java程式,輸出結果為以下:
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		
		char word = 'A'; // 初始字元 'A'
		
		for(int i = 1 ; i <= 6 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(word);
			}
			System.out.println();
			word++;
		}
	}
}
