package com.day01.javaplus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

/*
 * 常用快捷键
 */
public class demo3 {

	public static void main(String args[]) {
		// 增加行注释 ctrl+/

		// 增加块注释 ctrl+shift+/
		/* 增加块注释 */
		// 去掉注释 ctrl+shift+\

		// 内容提示 alt+/
		try {
			FileInputStream in = new FileInputStream("G://Project/train.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 快速修复 ctrl +1
		HashMap<String, Integer> ha = new HashMap<String, Integer>();

		// 导包 ctrl+shift+O

		// 格式化代码块 ctrl+shift+F

		// 向前向后看前一步后一步   alt+方向键
        
		// 查看代码类层次结构 ctrl +T
		System.out.println("test");
		
		//看快捷键列表     ctrl+shift+L

	}

}
