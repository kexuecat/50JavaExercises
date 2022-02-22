import java.util.Scanner;

public class _39thirty_ninth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = sc.nextInt();
		double result = 0;

		if (n % 2 == 0) {
			System.out.println(oResult(n));
		} else {
			System.out.println(jResult(n));
		}

	}

	private static double jResult(double n) {
		double result = 0;
		for (double i=1; i<=n; i+=2) {
			result += 1/i;
		}
		return result;
	}

	private static double oResult(double n) {
		double result = 0;
		for (double i=2; i<=n; i+=2) {
			result += 1/i;
		}
		return result;
	}

}
