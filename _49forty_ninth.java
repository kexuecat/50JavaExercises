import java.util.Scanner;

public class _49forty_ninth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入主字符串:");
		String strf = sc.nextLine();
		System.out.println("请输入子字符串:");
		String strs = sc.nextLine();

		String[] strt = new String[strf.length()-strs.length() + 1];

		for (int i=0; i<strt.length; i++) {
			strt[i] = strf.substring(i,i+strs.length());
		}

		int num = 0;
		for (int j=0; j<strf.length()-1; j++) {
			if (strs.equals(strt[j])) {
				num++;
			}
		}
		System.out.println("子字符串在父字符串中出现了"+num+"次");
	}
}
