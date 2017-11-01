package tt;

import java.util.Scanner;

@SuppressWarnings("all")
public class T4 {

	public static void main(String[] args) {
		int i = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("请输入字符串：");
			String a = sc.nextLine();
			char[] b = a.toCharArray();
			for (char c : b) {
				if ((((int) c) >= 65 && ((int) c) <= 90)
						|| (((int) c) >= 97 && ((int) c) <= 122)) {
					i++;
				}else if (((int) c) >= 48 && ((int) c) <= 57) {
					x++;
				}else if (((int) c)==32) {
					z++;
				}else {
					y++;
				}
			}
			System.out.println("英文字母=" + i);
			System.out.println("数字=" + x);
			System.out.println("其他字符是" + y);
			System.out.println("空格是" + z);
		}
	}

}
