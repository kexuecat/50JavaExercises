import java.util.Arrays;
import java.util.Scanner;

public class _28twenty_eighth {
	public static void main(String[] args) {
		System.out.println("请输入10个数（用空格隔开）:");
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		int temp = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("排列后的数组:" + Arrays.toString(arr));

	}
}