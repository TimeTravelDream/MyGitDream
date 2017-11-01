package tt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

@SuppressWarnings("all")
public class T6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
			try {
				fis = new FileInputStream("D:\\a.txt");
				isr = new InputStreamReader(fis, "gbk");
				byte[] b = new byte[1024];
				while (fis.read(b)!=-1) {
					System.out.println(new String(b));
				}
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println();
			}
			
	}
}
