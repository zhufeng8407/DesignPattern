package cn.com.pattern7.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAdapterTest {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		
		
//		System.out.println("strList has next? : " + iteratorAdapter.hasNext());
		
		
		
		strList.add("student");
		
		Iterator iteratorAdapter = strList.iterator();
		
		System.out.println("strList next element ? : " + iteratorAdapter.next());
		
		System.out.println("strList has next ? : " + iteratorAdapter.hasNext());
		
		
	}

}
