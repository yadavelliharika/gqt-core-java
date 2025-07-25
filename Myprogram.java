package com.gqt.corejava.staticsegment;
import java.util.*;
class person{
	String name;
	int age;
	String aadharnumber;
	static String nation;
	static {
		 nation="India";
		 
		
	}
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		name= sc.nextLine();
		System.out.println("enter the aadharnumber:");
		aadharnumber=sc.nextLine();
		System.out.println("enter the age");
		age=sc.nextInt();
		
	}
	void   displaydetails() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("aadharnumber:"+aadharnumber);
		System.out.println("nation:"+nation);
		System.out.println("--------");
	}
}

public class Myprogram {
	public static void main(String[] args) {
		person p1=new person();
		person p2=new person();
		System.out.println("person-1");
		p1.collectData();
		p1.displaydetails();
		System.out.println("person-2");
		p2.collectData();
		p2.displaydetails();
		
		
	}

}
