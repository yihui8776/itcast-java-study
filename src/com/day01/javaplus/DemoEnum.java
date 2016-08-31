package com.day01.javaplus;

import org.junit.Test;

/*
 * 枚举
 * 如何定义枚举的构造函数，方法和封装更多信息
 * java 程序在运行时需要一些变量是一定范围的情况
 */

//自定义一般Grade类 ,java 5 以前的方式
/*class Grade{
	//构造函数
	private Grade(){}
	//相当于5个成员对象 ,无参构造函数，静态生成了
	public static final Grade A = new Grade();
	public static final Grade B = new Grade();
	public static final Grade C = new Grade();
	public static final Grade D = new Grade();
	public static final Grade E = new Grade();
	
}*/

public class DemoEnum {
    @Test
	public void test1(){
		print(Grade.B);
	}
	
   
	//打印成绩
	public void print(Grade g) //传指定的值
	{
		String value = g.getValue();
		System.out.println(value);
	}
	
	@Test
	 public void test2(){
	    	print2(Grade1.A);
	    }
	    
	public void print2(Grade1 g){
		String value = g.localValue();
		System.out.println(value);
	}
	
}

 

enum Grade{//class A 100~90 B 89~80 C 79~70 D 69~60 E 59~0
	/*A,B,C,D,E; //Object  会报错
*/	
	A("100~90"),B("89~80"),C("79~70"),D("69~60"),E("59~0");
	
	
	private String value; //封装每个对象对应的分数
	private Grade(String value){//带参数构造函数 ,覆盖无参构造函数
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
  
	
}


//带抽象方法的枚举
enum Grade1{//class A 100~90 B 89~80 C 79~70 D 69~60 E 59~0
	/*A,B,C,D,E; //Object  会报错
*/	
	A("100~90"){
		public String localValue(){
			return "优";
		}
	},
	
	B("89~80"){
		public String localValue(){
			return "良";
		}
	},
	
	C("79~70"){
		public String localValue(){
			return "中";
		}
	},
	
	D("69~60"){
		public String localValue(){
			return "及格";
		}
	},
	
	E("59~0"){
		public String localValue(){
			return "差";
		}
	};
	
	
	private String value; //封装每个对象对应的分数
	private Grade1(String value){//带参数构造函数 ,覆盖无参构造函数
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
  
	 //抽象方法
	public abstract String localValue();
	
}


