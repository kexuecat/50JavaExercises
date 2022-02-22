import java.util.Scanner;

public class _12twelfth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入创造的利润（单位：万元）");
		while (!sc.hasNextDouble()) {
			System.out.println("输入不合法");
			sc.next();
		}
		double p = sc.nextDouble();
		double b;

		if (p <= 10)
			b = p * 0.1;
		else if (p <= 20)
			b = (p - 10) * 0.075 + 1;
		else if (p <= 40)
			b = (p - 10) * 0.05 + 1.75;
		else if (p <= 60)
			b = (p - 10) * 0.03 + 2.75;
		else if (p <= 100)
			b = (p - 10) * 0.015 + 3.35;
		else
			b = (p - 100) * 0.01 + 3.95;

		System.out.println(p + "万元利润,奖金是" + b + "万元");
	}
}
