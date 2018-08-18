package cn.com.refactor.chapt4.day1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class FileReaderTester extends TestCase {
	
	FileReader _input; 

	@BeforeEach
	protected void setUp() throws Exception {
		try {
			_input = new FileReader("/Users/zhufeng/Documents/workspace/DesignPattern/src/cn/com/refactor/chapt4/day1/data.txt");
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Unable to open  test file.");
		}
	}

	@AfterEach
	protected void tearDown() throws Exception {
		try {
			_input.close();
		} catch(IOException e) {
			throw new RuntimeException("Error on closing test file.");
		}
	}

	@Test
	void testRead() throws Exception {
		char ch = '&';
		for(int i = 0; i < 4; i++) {
			ch = (char)_input.read();
			assert('d' == ch);
		}
	}

}
