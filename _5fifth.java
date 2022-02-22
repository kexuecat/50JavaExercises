import java.util.Scanner;

public class _5fifth {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		score = sc.nextInt();

		if (score > 100 || score < 0) {
			System.out.println("成绩不合法");
		} else {
			System.out.println(score >= 90 ? "A" : score >= 60 ? "B" : "C");
		}
	}
}
