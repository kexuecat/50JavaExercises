/*判断101-200之间有多少个素数，并输出所有素数。
素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。*/

public class _2second {
	public static void main(String [] args) {
		int i,j,count=0;
		for (i=101; i<=200; i++) {
			for (j=2; j<i; j++) {
				if (i%j == 0) { //当i对j取余时为0说明存在除了1和它本身以外的因子
					break;
				}
			}
			if (j == i) {//等于它本身时才输出
				count++;
				System.out.println(i);
			}
		}
		System.out.println("101到200之间有"+count+"个素数");
	}
}
