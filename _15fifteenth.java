import java.util.Scanner;

public class _15fifteenth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入多个整数,用空格分开");

		String inputString = sc.nextLine();
		String stringArr[] = inputString.split(" ");
		int num[] = new int[stringArr.length];
		for (int i=0; i<stringArr.length;i++) {
			num[i] = Integer.parseInt(stringArr[i]);
		}

		int temp = 0;
		for (int j=0; j<num.length; j++) {
			for (int i = 0; i < num.length - 1; i++) {
				if (num[i] > num[i + 1]) {
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}

		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
