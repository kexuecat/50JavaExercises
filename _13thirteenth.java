public class _13thirteenth {
	public static void main(String[] args) {
		int num1 = 0,num2 = 0;

		for (int i=0; i<=100000; i++) {
			num1 = (int) Math.sqrt(i + 100);
			num2 = (int) Math.sqrt(i + 268);
			if (num1 * num1 == (i+100) && num2 * num2 == (i + 268)) {
				System.out.println(i);
			}
		}
	}
}
