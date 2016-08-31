package com.day01.javaplus;

import java.lang.reflect.Constructor;

import org.junit.Test;

/*
 * 反射
 * @param args
 * @throws ClassNotFoundException
 */
public class DemoReflect {

	//反射具体就是从某个类的在硬盘上的字节码转换加载到内存中的类代码
	//解剖类的构造函数，创建类的对象
	@Test
	public void test() throws Exception
	{
		//解剖类到内存
	     Class cla  = Class.forName("com.day01.javaplus.TestNumber3");
	     //获得构造函数
	     Constructor c = cla.getConstructor(null);
	     //创建类的对象
	     TestNumber3 tt  = (TestNumber3) c.newInstance(null);
	     
	     System.out.println(tt.toString());
	}
	
}
