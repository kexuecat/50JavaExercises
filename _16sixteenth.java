public class _16sixteenth {
	public static void main(String[] agrs) {
		for (int i=1; i<10; i++) {
			for (int j=1; j<=i; j++) {
				if(i*j < 10) {
					System.out.print(j+"*"+i+"="+j*i+"  ");
				} else {
					System.out.print(j+"*"+i+"="+j*i+" ");
				}
			}
			System.out.println();
		}
	}
}
