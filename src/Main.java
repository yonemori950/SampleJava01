import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 2, 3, 6, 8);
		Collections.reverse(list); // リストが[4, 2, 1, 6, 8]になる
		System.out.print(list);

		//List<Integer> list = Arrays.asList(1, 3, 2);
		Collections.sort(list, Collections.reverseOrder());
		System.out.print(list);

	}
}
