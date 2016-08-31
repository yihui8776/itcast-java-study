package com.day01.javaplus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/*
 * 泛型
 */

public class DemoGeneric{
	
	@Test
	public void test(){
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("bb");
		list.add("ccc");
		//避免类型强制转换
		//传统的
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
		}
		
		//增强for
		for(String str:list){
			System.out.println(str);
		}
	
		 
		
		
	}
	
	@Test
	public void test2(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a1");
		map.put(2, "bb2");
		map.put(3, "ccc3");
		
	     //传统  keyset ，entryset
		//set存放entry的集合，entry的map对是 Integer,String对，放入set
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		
		//迭代set
		
	    Iterator<Map.Entry<Integer, String>> it = set.iterator();
	    while(it.hasNext()){
	    	Map.Entry<Integer, String> entry = it.next();
	    	Integer ikey = entry.getKey();
	    	String ss = entry.getValue();
	    	System.out.println(ikey+":"+ss);
	    }
		
		
		
		
				
	}
}
