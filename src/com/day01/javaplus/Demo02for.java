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
 * ��ǿforѭ��
 * */

public class Demo02for {
	
	public static void main(String args[])
	{
	     int arr[] = {3,6,2};//��������
	     for (int num:arr)  //num Ϊ arr����������
	     {
	    	 System.out.println(num);
	     }
	
    	
	}	
    
	//��ǿforѭ��1
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
	
	
	//HashMap����ֱ�ӵ��������Ե�������key
	//@SuppressWarnings("retypes")
	@Test
    public void test2(){
		//@SuppressWarnings("rawtypes")
		 //Map map = new HashMap(); //�y��
		 Map map = new LinkedHashMap();  //����  
		 map.put("11", "aaa");
		 map.put("22", "bbb");
		 map.put("33", "ccc");
		
		 //HashMap ����ֱ�ӵ��������key�����ٵ���
		 Set set = map.keySet();
		 //����key���ϵĵ�����
		 Iterator it = set.iterator();
	     while(it.hasNext()){
	    	 String key = (String)it.next();
	    	 //��keyֵ��ȡvalue
	    	 String value = (String) map.get(key); 
	         System.out.println(key+":"+value);
	     }
	
	}
	
	
	    //����forѭ��2 ��ֱ��ѭ��
		//HashMap����ֱ�ӵ��������Ե�������key
		//@SuppressWarnings("retypes")
		@Test
	    public void test3(){
			//@SuppressWarnings("rawtypes")
			 //Map map = new HashMap(); //�Ǹ���hashcodeֵ����
			 Map map = new LinkedHashMap();  //����  �����洢˳��
			 map.put("11", "aaa");
			 map.put("22", "bbb");
			 map.put("33", "ccc");
			
			 for(Object obj:map.keySet()){
				 String key = obj.toString();
				 String value = (String) map.get(obj);
				 System.out.println(key+":"+value);
			 }
			 
		
		}
		
		 //����forѭ��ע�� ��ֻ����ȡ�������ܲ������������ô�ͳ����
		 
	
	
}
