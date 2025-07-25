package com.gqt.corejava.staticsegment;
import java.util.Scanner;
class Farmer{
	String name;
	int age;
	String crop;
	void collectData() {
		Scanner SC =new Scanner(System.in);
	    System.out.println("enter the name:");
	    name=SC.nextLine();
	    System.out.println("enter the crop:");
	    crop=SC.nextLine();
	    System.out.println("enter the age:");
		age=SC.nextInt();
		
	}
	void displayDetails() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("crop="+crop);
	}
}

public class Mainapp {
	public static void main (String[] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		System.out.println("Farmer-1");
		f1.collectData();
		f1.displayDetails();
		System.out.println("Farmer-2");
		f2.collectData();
		f2.displayDetails();
				
		
	}

}




