package com.day01.javaplus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

/*
 * ���ÿ�ݼ�
 */
public class demo3 {

	public static void main(String args[]) {
		// ������ע�� ctrl+/

		// ���ӿ�ע�� ctrl+shift+/
		/* ���ӿ�ע�� */
		// ȥ��ע�� ctrl+shift+\

		// ������ʾ alt+/
		try {
			FileInputStream in = new FileInputStream("G://Project/train.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �����޸� ctrl +1
		HashMap<String, Integer> ha = new HashMap<String, Integer>();

		// ���� ctrl+shift+O

		// ��ʽ������� ctrl+shift+F

		// ��ǰ���ǰһ����һ��   alt+�����
        
		// �鿴�������νṹ ctrl +T
		System.out.println("test");
		
		//����ݼ��б�     ctrl+shift+L

	}

}
