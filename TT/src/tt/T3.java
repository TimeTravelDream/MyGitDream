package tt;

import java.util.Scanner;

/*
 * 让我们用字母B来表示“百”、字母S表示“十”，用“12...n”来表示个位数字n（<10），换个格式来输出任一个不超过3位的正整数。例如234应该被输出为BBSSS1234，因为它有2个“百”、3个“十”、以及个位的4。

输入格式：每个测试输入包含1个测试用例，给出正整数n（<1000）。

输出格式：每个测试用例的输出占一行，用规定的格式输出n。

输入样例1：
234
输出样例1：
BBSSS1234
输入样例2：
23
输出样例2：
SS123

 */
@SuppressWarnings("all")
public class T3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("输入测试数");
			int a = sc.nextInt();
			int b = a/100;
			int c = (a-(b*100))/10;
			int d = a-(b*100+c*10);
			
			for(int i = 0 ;i<b;i++){
				System.out.print("B");
			}
			for(int i = 0 ;i<c;i++){
				System.out.print("S");
			}
			for(int i = 0 ;i<d;i++){
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	
}
