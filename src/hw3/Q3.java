package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	// 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
	// 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
	// (提示:Scanner)
	// (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	
	public static void main(String[] args) {
		
		// 輸入他不想要的數字
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入不想要的數字");
		int dislikeNumber = scanner.nextInt();
		
		// 檢查輸入是否有效
		while(dislikeNumber < 1 || dislikeNumber > 9) {
			System.out.println("請輸入有效的數字(0~9)：");
			dislikeNumber = scanner.nextInt();
		}
		
		// 生成可選擇的號碼列表
		List<Integer> availableNumbers = new ArrayList<>();
		for(int i = 1; i <= 49; i++) {
			if(i % dislikeNumber != 0) {
				availableNumbers.add(i);
			}
		}
		
		System.out.println("總共有 " + availableNumbers.size() + " 數字可選擇:");
        for (int i = 0; i < availableNumbers.size(); i++) {
            System.out.print(availableNumbers.get(i) + "\t");
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }
        
        scanner.close();
	}
}
