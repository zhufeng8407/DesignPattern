package cn.com.pattern3.myio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			InputStream in = new MyLowerInputStream(new BufferedInputStream(new FileInputStream(
					"/Users/zhufeng/Documents/workspace/DesignPattern/src/cn/com/pattern3/myio/test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
