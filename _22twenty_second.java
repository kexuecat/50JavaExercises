public class _22twenty_second {
	public static void main(String[] args) {
		System.out.println("5!是"+func(5));
	}

	private static int func(int i) {
		if (i == 1)
			return 1;

		return i * func(i - 1);
	}
}
