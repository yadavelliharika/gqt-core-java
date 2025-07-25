package com.gqt.corejava.staticsegment;
import java.util.Scanner;
class farmer{
	double principal;
	double time;
	static double rate;
	double si;
	static {
		rate=2.789;
	}
	void collectData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the principal:");
		principal =sc.nextDouble();
		System.out.println("enter the time:");
		time=sc.nextDouble();
	}
	  void calculate()
	{
		si=(principal*rate*time)/100;
	 }
	void display()
	{
		System.out.println("SI="+si);
	}
}

public class mainapp1 {

	public static void main (String[] args) {
		farmer f1=new farmer();
		farmer f2=new farmer();
		farmer f3=new farmer();
		System.out.println("farmer_1");
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("farmer_2");
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("farmer_3");
		f3.collectData();
		f3.calculate();
		f3.display();
	}
}


