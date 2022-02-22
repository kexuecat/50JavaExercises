import java.util.Scanner;

public class _38thirty_eighth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.next();
		System.out.println("字符串长度为"+strLength(str));
	}

	private static int strLength(String str) {
		return str.length();
	}
}
