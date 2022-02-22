import java.util.Scanner;

public class _24twenty_fourth {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");

		String inputString = sc.nextLine();
		String stringArr[] = inputString.split("");
		int num[] = new int[stringArr.length];
		int i=0,j;

		//将字符串转换成数字存入数组
		for (i=0; i<stringArr.length;i++) {
			num[i] = Integer.parseInt(stringArr[i]);
		}
		System.out.println("这个数字共有"+num.length+"位");
		//逆序打印
		System.out.println("逆序打印结果");
		for(j=i-1; j>=0; j--) {
			System.out.print(num[j]+"   ");
		}
	}
}
