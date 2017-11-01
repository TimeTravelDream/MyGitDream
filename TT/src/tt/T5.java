package tt;

import java.util.ArrayList;
import java.util.List;

public class T5 {

	public static void main(String[] args) {

		int[] a = { 1,5, 8, 4, 9, 3, 75, 62, 88, 7, 6, 19, 48, 55 };
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		int min = list.indexOf(a[0]);
		int max = list.indexOf(a[a.length - 1]);
		System.out.println(max+" "+min);
		list.set(max, list.get(0));
		System.out.println(list+"第一");
		list.set(0, a[a.length - 1]);
		System.out.println(list+"第二");
		list.set(min, list.get(a.length - 1));
		System.out.println(list+"第三");
		list.set(a.length - 1, a[0]);
		System.out.println(list);
	}
}
