package com.day01.javaplus;

public class Number3 implements calculator {

	private int num1;
	private int num2;
	private int num3;
	
	public  Number3(){//构造函数
		num1=num2=num3=0;
    }
    
    public Number3(int a,int b,int c){//构造函数
        num1=a;
        num2=b;
        num3=c;
    }
    
    public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	@Override
	public int add() {
		// TODO Auto-generated method stub
        return num1+num2+num3;
	}

	@Override
	public int substract() {
		// TODO Auto-generated method stub
		 return num1-num2-num3;
	}

	@Override
	public int divide() {
		// TODO Auto-generated method stub
		 return num1/num2/num3;
	}

	@Override
	public int multiple() {
		// TODO Auto-generated method stub
		 return num1*num2*num3;
	}
    
    public static void main(String args[]){
		
		int num1 = 8;
		int num2 = 4;
		int num3 = 2;
		Number3 num = new Number3(num1,num2,num3);
		
		System.out.println(num1+"+"+num2+"+"+num3+"="+num.add());
		System.out.println(num1+"-"+num2+"-"+num3+"="+num.substract());
		System.out.println(num1+"/"+num2+"/"+num3+"="+num.divide());
		System.out.println(num1+"*"+num2+"*"+num3+"="+num.multiple());
    }

	
}
