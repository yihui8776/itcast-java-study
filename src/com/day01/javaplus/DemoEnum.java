package com.day01.javaplus;

import org.junit.Test;

/*
 * ö��
 * ��ζ���ö�ٵĹ��캯���������ͷ�װ������Ϣ
 * java ����������ʱ��ҪһЩ������һ����Χ�����
 */

//�Զ���һ��Grade�� ,java 5 ��ǰ�ķ�ʽ
/*class Grade{
	//���캯��
	private Grade(){}
	//�൱��5����Ա���� ,�޲ι��캯������̬������
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
	
   
	//��ӡ�ɼ�
	public void print(Grade g) //��ָ����ֵ
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
	/*A,B,C,D,E; //Object  �ᱨ��
*/	
	A("100~90"),B("89~80"),C("79~70"),D("69~60"),E("59~0");
	
	
	private String value; //��װÿ�������Ӧ�ķ���
	private Grade(String value){//���������캯�� ,�����޲ι��캯��
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
  
	
}


//�����󷽷���ö��
enum Grade1{//class A 100~90 B 89~80 C 79~70 D 69~60 E 59~0
	/*A,B,C,D,E; //Object  �ᱨ��
*/	
	A("100~90"){
		public String localValue(){
			return "��";
		}
	},
	
	B("89~80"){
		public String localValue(){
			return "��";
		}
	},
	
	C("79~70"){
		public String localValue(){
			return "��";
		}
	},
	
	D("69~60"){
		public String localValue(){
			return "����";
		}
	},
	
	E("59~0"){
		public String localValue(){
			return "��";
		}
	};
	
	
	private String value; //��װÿ�������Ӧ�ķ���
	private Grade1(String value){//���������캯�� ,�����޲ι��캯��
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
  
	 //���󷽷�
	public abstract String localValue();
	
}


