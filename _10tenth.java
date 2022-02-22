import java.util.Scanner;

public class _10tenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入下落高度");
		double h = sc.nextDouble();
		int count = 0;
		double dis = h;

		do {
			h /= 2;
			dis += h*2;
			count++;
		} while (h >= 0.01);

		System.out.println("小球弹跳次数: "+count);
		System.out.println("小球经过距离: "+dis);
	}
}
