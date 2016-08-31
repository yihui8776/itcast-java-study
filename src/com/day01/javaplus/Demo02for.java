package com.day01.javaplus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
 * 增强for循环
 * */

public class Demo02for {
	
	public static void main(String args[])
	{
	     int arr[] = {3,6,2};//操作数组
	     for (int num:arr)  //num 为 arr内数，遍历
	     {
	    	 System.out.println(num);
	     }
	
    	
	}	
    
	//增强for循环1
	@Test
    public void test1(){
		//@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
	     for (Object obj:list)  
	     {
	    	 System.out.println(obj);
	     }
	
	}
	
	
	//HashMap不能直接迭代，可以迭代她的key
	//@SuppressWarnings("retypes")
	@Test
    public void test2(){
		//@SuppressWarnings("rawtypes")
		 //Map map = new HashMap(); //亂序
		 Map map = new LinkedHashMap();  //有序  
		 map.put("11", "aaa");
		 map.put("22", "bbb");
		 map.put("33", "ccc");
		
		 //HashMap 不能直接迭代，获得key集合再迭代
		 Set set = map.keySet();
		 //迭代key集合的迭代器
		 Iterator it = set.iterator();
	     while(it.hasNext()){
	    	 String key = (String)it.next();
	    	 //用key值获取value
	    	 String value = (String) map.get(key); 
	         System.out.println(key+":"+value);
	     }
	
	}
	
	
	    //增強for循环2 ，直接循环
		//HashMap不能直接迭代，可以迭代她的key
		//@SuppressWarnings("retypes")
		@Test
	    public void test3(){
			//@SuppressWarnings("rawtypes")
			 //Map map = new HashMap(); //是根据hashcode值排序
			 Map map = new LinkedHashMap();  //有序  ，按存储顺序
			 map.put("11", "aaa");
			 map.put("22", "bbb");
			 map.put("33", "ccc");
			
			 for(Object obj:map.keySet()){
				 String key = obj.toString();
				 String value = (String) map.get(obj);
				 System.out.println(key+":"+value);
			 }
			 
		
		}
		
		 //增強for循环注意 ，只可以取数，不能操作，操作得用传统迭代
		 
	
	
}
