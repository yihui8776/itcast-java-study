package com.day01.javaplus;

public class Number {
	//数据成员
    private int n1;
    private int n2;
    
    public  Number(){//构造函数
    	n1=n2=0;
    }
    
    public Number(int a,int b){//构造函数
    	n1=a;
    	n2=b;
    }
    
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	//加法
	public int additon(){
		return n1+n2;
	}
	
	//减法
	public int subtration(){
		return n1-n2;
	}
	
	//乘法
	public int multiplication(){
		return n1*n2;
	}
	
	//除法
	public int division(){
		return n1/n2;
	}

	public static void main(String args[]){
		
		int num1 = 4;
		int num2 = 2;
		Number num = new Number(num1,num2);
		
		System.out.println(num1+"+"+num2+"="+num.additon());
		System.out.println(num1+"-"+num2+"="+num.subtration());
		System.out.println(num1+"-"+num2+"*"+num.multiplication());
		System.out.println(num1+"-"+num2+"/"+num.division());
		
	}
}


