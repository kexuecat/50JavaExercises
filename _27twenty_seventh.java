public class _27twenty_seventh {
	public static void main(String[] args) {
		int j,i,count=0;
		for (i=1; i<=100; i++) {
			for (j=2;j<=i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("共有"+count+"个素数");
	}
}
