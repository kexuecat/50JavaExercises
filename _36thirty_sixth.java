import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _36thirty_sixth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要输入的数字个数n");
		int n = sc.nextInt();
		System.out.println("请输入要向后移动数字的个数");
		int m = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		for (int i=0; i<n; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			list.add(sc.nextInt());
		}
		System.out.println("原来的顺序" + list.toString());

		List<Integer> temp1 = list.subList(list.size()-m,list.size());
		List<Integer> temp2 = list.subList(0, list.size()-m);

		temp2.addAll(0, temp1);

		System.out.println("移动后顺序" + temp2.toString());
	}
}
