import java.util.Scanner;

public class _8eighth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入a的值");
		int a = sc.nextInt();
		System.out.println("请输入最大项的位数");
		int c = sc.nextInt();
		int s = 0,t = 0;
		for (int i=1; i<=c; i++) {
			t += a;
			a *= 10;
			s += t;
		}
		System.out.println(s);
	}
}
