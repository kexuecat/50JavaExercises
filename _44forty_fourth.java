import java.util.Scanner;

public class _44forty_fourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个偶数");
		int num = sc.nextInt();
		while (num % 2 != 0) {
			System.out.println("请输入一个偶数");
			num = sc.nextInt();
		}

		for (int j=2; j<num; j++) {
			if (isPrime(j)&&isPrime(num-j)) {
				System.out.println(num + " = " + j + " + " + (num - j));
				break;
			}
		}
	}

	private static boolean isPrime(int x) {
		boolean flag = true;
		for (int i=2; i<Math.sqrt(x)+1; i++) {
			if (x % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
