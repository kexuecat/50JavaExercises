public class _17seventeenth {
	public static void main(String[] args) {
		int day = 9, i = 0, j = 1;

		while (day > 0) {
			i = (j + 1) * 2;
			j = i;
			day --;
		}
		System.out.println("第一天有" + j + "个桃子");
	}
}
