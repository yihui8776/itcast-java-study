package com.day01.javaplus;

import java.lang.reflect.Constructor;

import org.junit.Test;

/*
 * ����
 * @param args
 * @throws ClassNotFoundException
 */
public class DemoReflect {

	//���������Ǵ�ĳ�������Ӳ���ϵ��ֽ���ת�����ص��ڴ��е������
	//������Ĺ��캯����������Ķ���
	@Test
	public void test() throws Exception
	{
		//�����ൽ�ڴ�
	     Class cla  = Class.forName("com.day01.javaplus.TestNumber3");
	     //��ù��캯��
	     Constructor c = cla.getConstructor(null);
	     //������Ķ���
	     TestNumber3 tt  = (TestNumber3) c.newInstance(null);
	     
	     System.out.println(tt.toString());
	}
	
}
