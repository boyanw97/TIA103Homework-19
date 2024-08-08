package hw3;

import java.util.Scanner;
import java.util.Random;

public class Q2 {
	
	// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
	// (提示:Scanner,亂數方法,無窮迴圈)
	// (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// 隨機生成一個0到100之間的數字
		int randomNumber = random.nextInt(10); // 0~9
		int guess = -1; // 初始猜測值為-1
		
		System.out.println("開始猜數字！");
		
		while(guess != randomNumber) {
			System.out.println("請輸入你的猜測(0~9)：");
			guess = scanner.nextInt();
			
			if(guess < randomNumber) {
				System.out.println("數字太小，猜錯了！");
			} else if(guess > randomNumber) {
				System.out.println("數字太大，猜錯了！");
			} else {
				System.out.println("答對了！答案是" + randomNumber);
			}
		}
		
		scanner.close();
	}
}
