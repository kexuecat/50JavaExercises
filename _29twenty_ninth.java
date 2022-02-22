import java.util.Scanner;

public class _29twenty_ninth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];

		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("第一条对角线"+ (arr[0][0]+arr[1][1]+arr[2][2]));
		System.out.println("第二条对角线"+ (arr[0][2]+arr[1][1]+arr[2][0]));
	}
}
