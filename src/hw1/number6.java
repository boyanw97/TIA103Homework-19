package hw1;

public class number6 {
	
	public static void main(String[] args) {
		int a = 5;
		int sum = a + a;
		
		System.out.println(sum);
		// 此為整數型別int 5+5，所以得出十進位之和為10。
		
		System.out.println(5 + '5');
		// 此為整數型別int 5 + 型別char 5，'5'在unicode的十進位為 53，所以兩者之和為58。
		
		System.out.println(5+"5");
		// 此為整數型別int 5 + 型別string "5", 整數與字串相加為串接相加而不是數學加法，所以結果為55。
		
	}

}
