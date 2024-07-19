package hw1;

public class number3 {
	
	public static void main(String[] args) {
		int time = 256559;
		int day = time / (24 * 60 * 60);
		int hour = (time / (60 * 60)) % 24;
		int min = (time / 60) % 60;
		int sec = time % 60;
		
		System.out.println("秒數：" + time);	
		System.out.println("天數：" + day);	
		System.out.println("小時：" + hour);	
		System.out.println("分鐘：" + min);	
		System.out.println("秒數：" + sec);	
		
		}
		
}
