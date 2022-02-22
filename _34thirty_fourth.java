import java.util.Arrays;
import java.util.Scanner;

public class _34thirty_fourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个数,用空格分隔");
		String[] arr = sc.nextLine().split(" ");
		if (arr.length > 3) {
			System.out.println("非法输入");
		} else {
			Arrays.sort(arr);
			for (int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
