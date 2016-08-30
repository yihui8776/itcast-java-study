package com.day01.javaplus;



 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
//junit ���԰���

public class TestNumber3 {

	
	private Number3 n = new Number3() ;
	
	@Before  //����ǰ,�����Ĳ�����Դ����һ��д
	public void before(){
		System.out.println("before");
	        n.setNum1(8);
	        n.setNum2(4);
	        n.setNum3(2);
	    
		
	}
	
	
	//@SuppressWarnings("deprecation")  //���ƹ��ڷ�������
	@SuppressWarnings("deprecation")
	@Test  //Ҫ�Ӳ��ܲ���
	public void testadd() {
		//TestNumber3 p = new TestNumber3();
		//p.testadd();
		//fail("Not yet implemented");
		//n.add();
		//���ԣ�ǰ�������������������ʵ��
		Assert.assertEquals(14, n.add());
	}
	
	//@SuppressWarnings("deprecation")
		@SuppressWarnings("deprecation")
		@Test  //Ҫ�Ӳ��ܲ���
		public void testsub() {
			//TestNumber3 p = new TestNumber3();
			//p.testadd();
			//fail("Not yet implemented");
			//n.add();
			//���ԣ�ǰ�������������������ʵ��
			Assert.assertEquals(2, n.substract());
		}
		
	//@SuppressWarnings("deprecation")
    @SuppressWarnings("deprecation")
	@Test  //Ҫ�Ӳ��ܲ���
		public void testmul() {
			//TestNumber3 p = new TestNumber3();
			//p.testadd();
			//fail("Not yet implemented");
			//n.add();
			//���ԣ�ǰ�������������������ʵ��
			Assert.assertEquals(64, n.multiple());
		}
  //@SuppressWarnings("deprecation")
    @SuppressWarnings("deprecation")
	@Test  //Ҫ�Ӳ��ܲ���
		public void testdiv() {
			//TestNumber3 p = new TestNumber3();
			//p.testadd();
			//fail("Not yet implemented");
			//n.add();
			//���ԣ�ǰ�������������������ʵ��
			Assert.assertEquals(1, n.divide());
		}
    
	@After 
	public void after(){
		System.out.println("after");
		n=null;
	}

}
