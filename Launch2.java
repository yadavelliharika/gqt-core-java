package com.gqt.corejava.staticsegment;
class calculator{
	void add() {
		int a=10;
		int b=20;
		int result =a+b;
		System.out.println(result);
		
	}
	void sub(int b,int c) {
		int result=b-c;
		System.out.println(result);
	}
}

public class Launch2 {
	public static void main(String[] args) {
		calculator c1=new calculator();
		c1.add();
		c1.sub(30, 10);
		
	}

}
