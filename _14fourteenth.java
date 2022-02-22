import java.util.Scanner;

public class _14fourteenth {
	public static void main(String[] args) {
		System.out.println("请输入年月日（用空格隔开）例如: 2019 1 14");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int sum = day;
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};

		boolean isLeapYear =(((year%4==0)&&(year%100!=0))||(year%400==0))&&(month>2);
		if (isLeapYear) {
			sum ++;
		}
		
		for(int i=1; i < month; i++) {
			sum += arr[i];
		}
		
		System.out.println(year+"年"+month+"月"+day+"日，是这年的第"+sum+"天");
	}
}
