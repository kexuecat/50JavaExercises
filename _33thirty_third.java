import java.util.Scanner;

public class _33thirty_third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入最高项");
		int n = sc.nextInt();
		int i,j;
		int arr[][] = new int[n][n];

		for (i=0; i<arr.length; i++) {
			arr[i][i] = 1;
			arr[i][0] = 1;
		}

		for (i=2; i<arr.length; i++) {
			for (j=1; j<i; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}

		for (i=0; i<arr.length; i++) {
			for (int k=arr.length-i; k>0; k--) {
				System.out.print(" ");
			}
			for (j=0; j<arr.length; j++) {
				if (arr[i][j] != 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
