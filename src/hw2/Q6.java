package hw2;

public class Q6 {
	
	public static void main(String[] args) {
		
		// Q6.請設計一隻Java程式,輸出結果為以下:
		// 1 2 3 4 5 6 7 8 9 10
	    // 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2 
		// 1
		
		for(int i = 10 ; i >= 1 ; i--) {      // 輸出後共10行，且為號碼數遞減
			for(int j = 1 ; j <= i ; j++){    // 輸出1~10，每到下一行便少一個尾數
				System.out.print(j + " ");
		    }
		    System.out.println();
		}
	}
}
