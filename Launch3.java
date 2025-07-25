package com.gqt.corejava.staticsegment;
class Dog{
	String name;
	String color;
	String breed;
	int cost;
	void allocatedata() {
		name="rocky";
		color="white";
		breed="german shepard";
		cost=7000;
	}
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		
	}
}

public class Launch3 {
	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.name="sammy";
		d1.allocatedata();
		d1.display();
		
		
		
	}

}
