public class _19nineteenth {
	public static void main(String[] args) {
		int size = 9;
		for (int i=0;i<size/2;i++) {
			for (int j=size/2;j>i;j--) {
				System.out.print(" ");
			}
			for (int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i=0;i<size/2+1;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for (int k=size-2*i;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
