package hw2;

public class Q5 {

	public static void main(String[]args){
		
		// Q5.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		// 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		
		int sum1 = 0, mul1 = 10; 
		for(int num = 1 ; num <= 49 ; num++) {
			if(num % mul1 == 4) {             //排除 14 24 34 44
			}
			else if(num / mul1 == 4) {        //排除 40 41 42 43 44 45 46 47 48 49
			}
			else {
				System.out.print(num + " ");
				sum1++;                        //總號碼數
			}
		}
		System.out.println();
		System.out.println("共" + sum1 + "個號碼");
		System.out.println();
	}
}
