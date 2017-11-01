package tt;

import java.util.Scanner;

@SuppressWarnings("all")
public class T7 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入一个大于7位的整数：");
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			if (a.length()>6) {
				String d = aaa(a);
				String e = d.substring(3, 7);
				String c = aaa(e);
				System.out.println(c);
			}
		}
	}

	public static String aaa(String a) {
		char[] b = a.toCharArray();
		char[] c = new char[b.length];
		int x = 0;
		for (int i = b.length; i > 0; i--) {
			c[x] = b[i - 1];
			x++;
		}
		String d = new String(c);
		return d;
	}
}
