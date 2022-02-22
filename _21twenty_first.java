public class _21twenty_first {
	public static void main(String[] args) {
		long sum = 0;
		for (int i=1; i<=20; i++) {
			sum += fun(i);
		}

		System.out.println("1到20的阶乘为："+sum);
	}

	private static long fun(int i) {
		long temp = 1;
		for (int j=1; j<=i; j++) {
			temp *= j;
		}

		return temp;
	}
}
