public class _42forty_second {
	public static void main(String[] args) {
		for (int i=10;i < 100; i++) {
			if ((809*i) == (800*i+9*i) &&
					(8*i)>=10&&(8*i)<100 &&
					(9*i)>=100&&(9*i)<1000)
			{
				System.out.println("?? = "+i);
				System.out.println("809*?? = "+(809*i));
			}
		}
	}
}
