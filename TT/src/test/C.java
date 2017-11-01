package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C {
	public static void main(String[] args) {
		Date a = new Date();
		DateFormat b = new SimpleDateFormat("yyyy/MM/dd");
		String c = b.format(a);
		System.out.println(c);
		
	}
}
