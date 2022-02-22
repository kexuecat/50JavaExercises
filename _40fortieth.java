import java.util.ArrayList;
import java.util.Collections;

public class _40fortieth {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("11111");
		list.add("33333");
		list.add("22222");
		Collections.sort(list);
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
