public class _11eleventh {
	public static void main(String[] args) {
		int count = 0;
		for (int h=1; h<=4; h++) {
			for (int t=1; t<=4; t++){
				for (int b=1; b<=4; b++){
					if (h != t && t != b && h != b) {
						System.out.println(h*100+t*10+b);
						count ++;
					}
				}
			}

		}
		System.out.println("一共可以组成"+count+"个数");
	}
}
