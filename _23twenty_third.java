public class _23twenty_third {
	public static void main(String[] args) {
		System.out.println(func(1,10));
	}

	private static int func(int i,int s) {
		if (i == 5) {
			return s;
		}
		return  func(i + 1, s += 2);
	}
}
