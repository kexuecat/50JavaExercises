public class _3third {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int h = i/100;      //百位
			int t = i%100/10;   //十位
			int b = i%10;       //个位
			int temp = h*h*h+t*t*t+b*b*b;
			if (i == temp) {
				System.out.println(i);
			}
		}
	}
}