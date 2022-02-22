import java.util.Scanner;

public class _35thirty_fifth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入数字，用空格分开");
		String[] str = sc.nextLine().split(" ");
		int[] arr = new int[str.length];

		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
			System.out.print(arr[i] + " ");
		}

		int  min = arr[0],max = arr[0],
				id1 = 0,id2 =0,
				temp1 = 0,temp2 = 0;

		for (int j=0; j<arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
				id1 = j;
			}
			if (arr[j] < min) {
				min = arr[j];
				id2 = j;
			}
		}

		if (id1 != 0) {
			temp1 = arr[0];
			arr[0] = arr[id1];
			arr[id1] = temp1;
		}
		if (id2 != 0) {
			temp2 = arr[arr.length-1];
			arr[arr.length-1] = arr[id2];
			arr[id2] = temp2;
		}
		System.out.println("最小"+min+"最大"+max);

		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
