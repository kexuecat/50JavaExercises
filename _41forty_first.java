public class _41forty_first {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=6; ;i++) {
			sum = i;
			for (int j=0; j<5; j++) {
				if ((sum - 1) % 5 == 0 && j<5) {
					sum = (sum - 1) / 5 *  4;
					if (j == 4) {
						System.out.println(i);
						System.exit(0);
					}
				}
			}
		}
	}
}
