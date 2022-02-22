import java.util.Scanner;

public class _25twenty_fifth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数字");
		String str = sc.nextLine();

		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		String newStr = new String(stringBuilder);

		if (newStr.equals(str)) {
			System.out.println(str+"是回文数");
		} else {
			System.out.println(str+"不是回文数");
		}

	}
}
