package com.day01.javaplus;



 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
//junit 测试案例

public class TestNumber3 {

	
	private Number3 n = new Number3() ;
	
	@Before  //测试前,公共的步骤资源可以一次写
	public void before(){
		System.out.println("before");
	        n.setNum1(8);
	        n.setNum2(4);
	        n.setNum3(2);
	    
		
	}
	
	
	//@SuppressWarnings("deprecation")  //抑制过期方法报警
	@SuppressWarnings("deprecation")
	@Test  //要加才能测试
	public void testadd() {
		//TestNumber3 p = new TestNumber3();
		//p.testadd();
		//fail("Not yet implemented");
		//n.add();
		//断言，前面参数是期望，后面是实际
		Assert.assertEquals(14, n.add());
	}
	
	//@SuppressWarnings("deprecation")
		@SuppressWarnings("deprecation")
		@Test  //要加才能测试
		public void testsub() {
			//TestNumber3 p = new TestNumber3();
			//p.testadd();
			//fail("Not yet implemented");
			//n.add();
			//断言，前面参数是期望，后面是实际
			Assert.assertEquals(2, n.substract());
		}
		
	//@SuppressWarnings("deprecation")
    @SuppressWarnings("deprecation")
	@Test  //要加才能测试
		public void testmul() {
			//TestNumber3 p = new TestNumber3();
			//p.testadd();
			//fail("Not yet implemented");
			//n.add();
			//断言，前面参数是期望，后面是实际
			Assert.assertEquals(64, n.multiple());
		}
  //@SuppressWarnings("deprecation")
    @SuppressWarnings("deprecation")
	@Test  //要加才能测试
		public void testdiv() {
			//TestNumber3 p = new TestNumber3();
			//p.testadd();
			//fail("Not yet implemented");
			//n.add();
			//断言，前面参数是期望，后面是实际
			Assert.assertEquals(1, n.divide());
		}
    
	@After 
	public void after(){
		System.out.println("after");
		n=null;
	}

}
