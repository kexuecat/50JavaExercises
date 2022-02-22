import java.util.Scanner;

public class _37thirty_seventh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入队列人数");
		int n = sc.nextInt();
		boolean[] arr = new boolean[n];

		for (int i=0; i<n; i++) {
			arr[i] = true;
		}

		int count = n,num = 0,index = 0;
		while (count > 1) {
			if (arr[index]) {
				num++;
				if (num == 3) {
					arr[index] = false;
					num = 0;
					count--;
				}
			}
			index++;
			if (index == n) {
				index = 0;
			}
		}

		for (int i=0; i<n; i++) {
			if (arr[i]) {
				System.out.println("最后留下的是"+ (i+1) + "号");
			}
		}
	}
}
