import java.util.Arrays;
import java.util.Random;

public class _31thirty_first {
	public static void main(String[] args) {
		int arr1[] = new int[12];
		Random r = new Random();
		for (int i = 0; i <= 10; i++) {
			arr1[i] = r.nextInt(100);
		}
		System.out.println("原数组"+ Arrays.toString(arr1));

		int arr2[] = new int[arr1.length];
		int j = arr1.length;
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[j-1];
			--j;
		}
		System.out.println("数组的逆序输出"+ Arrays.toString(arr2));
	}
}
