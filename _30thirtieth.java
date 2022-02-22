import java.util.Random;
public class _30thirtieth {
	public static void main(String[] args) {
		int temp = 0;
		int arr[] = new int[12];
		Random r = new Random();
		for (int i = 0; i <= 10; i++)
			arr[i] = r.nextInt(1000);
		for (int i = 0; i <= 10; i++)
				System.out.print(arr[i] + "\t");
		for (int i = 0; i <= 9; i++)
			for (int k = i + 1; k <= 10; k++)
				if (arr[i] > arr[k]) {
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
		System.out.println("随机数组");
		for (int k = 0; k <= 10; k++)
			System.out.print(arr[k] + "\t");
		arr[11] = r.nextInt(1000);
		for (int k = 0; k <= 10; k++)
			if (arr[k] > arr[11]) {
				temp = arr[11];
				for (int j = 11; j >= k + 1; j--)
					arr[j] = arr[j - 1];
					arr[k] = temp;
			}
		System.out.println("排序后的数组");
		for (int k = 0; k <= 11; k++)
			System.out.print(arr[k] + "\t");
		System.out.println("插入后的数组");
	}
}

