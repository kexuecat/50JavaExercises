import java.util.Scanner;

public class _47forty_seventh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入7个大于等于1小于等于50的数");
		int[] n = new int[7];
		for (int i=0; i<7; i++) {
			n[i] = sc.nextInt();
			if (n[i] > 50 || n[i] < 1) {
				System.out.println("输入不合法,请重新输入");
				i = -1;
			}
		}

		for (int m=0; m<n.length; m++) {
			System.out.println(printStar(n[m]));
		}
	}

	private static String printStar(int n) {
		String star = "";
		for (int j=0; j<n; j++) {
			star += "*";
		}
		return star;
	}
}
