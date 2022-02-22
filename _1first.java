/*有一对兔子，从出生后第3个月起每个月生一对兔子，小兔子长到第三个月后每个月又生一对，
以此类推，每个月多少兔子
*/
// 1 2
// 2 2
// 3 4
// 4 6
// 5 10
// 6 16
public class _1first {
	public static void main(String[] args) {
		int arr[] = new int[12];
		arr[0] = arr[1] = 2;
		System.out.println("第"+1+"个月有"+2+"只兔子");
		System.out.println("第"+2+"个月有"+2+"只兔子");

		for (int i=2; i<12; i++) {
			arr[i] = arr[i-1]+arr[i-2];
			System.out.println("第"+(i+1)+"个月有"+arr[i]+"只兔子");
		}
	}
}

/*
import java.util.Scanner;

public class _1first{
	public static void main(String[] args){
			System.out.print("请输入你想知道的兔子数量的月份：");
			Scanner scanner=new Scanner(System.in);
			int n =scanner.nextInt();//获取输入的整数
			System.out.println("第"+n+"个月兔子总数为"+fun(n));
			scanner.close();
	}
	//求得所需月份的兔子的数量，返回值为兔子的数量
	private static int fun(int n){
		if(n==1||n==2)
			return 1;
		else
			return fun(n-1)+fun(n-2);
	}
}
*/
