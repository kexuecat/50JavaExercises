import java.util.Scanner;

public class _48forty_eighth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个四位整数：");
		String[] str = sc.nextLine().split("");
		int[] arrOld = new int[str.length];
		int[] arrNew = new int[str.length];
		int temp;

		for (int i=0; i<arrOld.length; i++) {
			arrOld[i] = Integer.parseInt(str[i]);
		}

		for (int i=0; i<arrNew.length; i++) {
			arrNew[i] = (arrOld[i] + 5) % 10;
		}
		temp = arrNew[0];
		arrNew[0] = arrNew[3];
		arrNew[3] = temp;
		temp = arrNew[1];
		arrNew[1] = arrNew[2];
		arrNew[2] = temp;

		System.out.print("加密后的结果为: ");
		for (int i=0; i<arrNew.length; i++) {
			System.out.print(arrNew[i]);
		}
	}
}
