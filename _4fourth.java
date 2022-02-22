import java.util.Scanner;

public class _4fourth {
	public static void main(String[] args) {
		int i, k = 2;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要分解质因数的正整数");
		i = sc.nextInt();

		if (i != 1) {
			System.out.println("不能被分解");
		} else {
			System.out.print("分解后的质因数为:1");
			while (k <= i) {
				if (i % k == 0) {
					System.out.print("*" + k);
					i /= k;
				} else {
					k++;
				}
			}
		}
		sc.close();
	}
}
