import java.util.Scanner;

public class _6sixth {
	public static void main(String[] args) {
		int a,b,m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		a = sc.nextInt();
		System.out.println("请再输入一个正整数");
		b = sc.nextInt();
		judge j = new judge();
		m = j.judge(a,b);
		n = a*b/m;
		System.out.println("最大公约数:"+m);
		System.out.println("最小公倍数:"+n);
	}

	static class judge {
		public int judge(int m, int n) {
			if (m<n) {
				int t = m;
				m = n;
				n = t;
			}
			while (n != 0) {
				if (m == n) return m;
				else {
					int k= m % n;
					m = n;
					n = k;
				}
			}
			return m;
		}
	}
}
