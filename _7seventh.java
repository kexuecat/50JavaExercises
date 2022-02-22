import java.util.Scanner;

public class _7seventh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符");
		String str = sc.nextLine();
		char[] chars = str.toCharArray();
		count c = new count();
		c.count(chars);
	}

	/*static class count {
		int letter,digital,blank,other;
		public void count(char[] arr) {
			for (int i=0; i<arr.length; i++) {
				if (arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z'){
					letter++;
				} else if (arr[i]>='0'&&arr[i]<='9'){
					digital++;
				} else if (arr[i] == ' ') {
					blank++;
				} else {
					other++;
				}
				System.out.println(arr[i]);
			}
			System.out.println("字母数量:"+letter);
			System.out.println("数字数量:"+digital);
			System.out.println("空格数量:"+blank);
			System.out.println("其他字符:"+other);
		}
	}*/

	static class count {
		int letter, digital, blank, other;
		public void count(char[] arr) {
			for (int i = 0; i < arr.length; i++) {
				if (Character.isLetter(arr[i])) {
					letter++;
				} else if (Character.isDigit(arr[i])) {
					digital++;
				} else if (Character.isSpaceChar(arr[i])) {
					blank++;
				} else {
					other++;
				}
			}
			System.out.println("字母数量:"+letter);
			System.out.println("数字数量:"+digital);
			System.out.println("空格数量:"+blank);
			System.out.println("其他字符:"+other);
		}
	}
}
