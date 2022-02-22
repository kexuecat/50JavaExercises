import java.util.Scanner;

public class _32thirty_second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个7位以上正整数");
		long l = sc.nextLong();
		String str = Long.toString(l);
		char[] chars = str.toCharArray();
		int i = chars.length;
		if (i < 7) {
			System.out.println("输入错误");
		} else {
			System.out.println("4~7位为:"
					+ chars[i-4] + " "
					+ chars[i-3] + " "
					+ chars[i-2] + " "
					+ chars[i-1]);
		}
	}
}
