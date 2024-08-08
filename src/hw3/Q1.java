package hw3;

import java.util.Scanner;

public class Q1 {
	
	// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
	// (提示:Scanner,三角形成立條件,判斷式if else)
	// (進階功能:加入直角三角形的判斷)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 輸入三個邊長
		System.out.println("請輸入三個邊長：");
		System.out.print("邊長 a: ");
		int a = scanner.nextInt();
		System.out.print("邊長 b: ");
		int b = scanner.nextInt();
		System.out.print("邊長 c: ");
		int c = scanner.nextInt();
		
		 // 檢查是否為三角形
		if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || b == c || a == c) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其他三角形");
            }
        } else {
            System.out.println("不是三角形");
        }

        scanner.close();
	}
	
	private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
    
}
