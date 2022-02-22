import java.util.Scanner;
public class _26twenty_sixth {
	public static void main(String[] args){
		char weekSecond;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入星期值英文的第一个字母，我来帮您判断是星期几：");
		String letter = input.next();
		if (letter.length() == 1){
			char weekFirst = letter.charAt(0);
			switch (weekFirst){
				case 'm':
				case 'M':
					System.out.println("星期一(Monday)");
					break;
				case 't':
				case 'T':
					System.out.print("由于星期二(Tuesday)与星期四(Thursday)均以字母T开头，故需输入第二个字母才能正确判断：");
					letter = input.next();
					if (letter.length() == 1){
						weekSecond = letter.charAt(0);
						if (weekSecond == 'U' || weekSecond == 'u'){
							System.out.println("星期二(Tuesday)");
							break;
						} else if (weekSecond == 'H' || weekSecond == 'h'){
							System.out.println("星期四(Thursday)");
							break;
						} else{
							System.out.println("输入错误，不能识别的星期值第二个字母，程序结束！");
							break;
						}
					} else {
						System.out.println("输入错误，只能输入一个字母，程序结束！");
						break;
					}
				case 'w':
				case 'W':
					System.out.println("星期三(Wednesday)");
					break;
				case 'f':
				case 'F':
					System.out.println("星期五(Friday)");
					break;
				case 's':
				case 'S':
					System.out.print("由于星期六(Saturday)与星期日(Sunday)均以字母S开头，故需输入第二个字母才能正确判断：");
					letter = input.next();
					if (letter.length() == 1){
						weekSecond = letter.charAt(0);
						if (weekSecond == 'A' || weekSecond == 'a'){
							System.out.println("星期六(Saturday)");
							break;
						} else if (weekSecond == 'U' || weekSecond == 'u'){
							System.out.println("星期日(Sunday)");
							break;
						} else{
							System.out.println("输入错误，不能识别的星期值第二个字母，程序结束！");
							break;
						}
					} else{
						System.out.println("输入错误，只能输入一个字母，程序结束！");
						break;
					}
				default:
					System.out.println("输入错误，不能识别的星期值第一个字母，程序结束！");
					break;
			}
		} else{
			System.out.println("输入错误，只能输入一个字母，程序结束！");
		}
	}
}