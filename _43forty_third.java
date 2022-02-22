public class _43forty_third {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i=0; i<8; i++) {
			if (i == 0) {//一位数
				count = 4;
			} else if (i == 1) {//两位数
				count *= 7;
			} else if (i >= 2) {
				count *= 8;
			}
			sum += count;
			System.out.println("组成"+(i+1)+"位数时有"+count+"种组合方式");
		}
		System.out.println("共有"+sum+"种组合方式");
	}
}
