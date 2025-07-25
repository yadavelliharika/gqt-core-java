package com.gqt.corejava.staticsegment;
class Dog1{
	String name;
	String color;
	String breed;
	int cost;
	void run() {
		System.out.println("Dog runs");
		}
	void eat() {
		System.out.println("Dog eats");
	}
}

public class Launch4 {
	public static void main(String[] args) {
		Dog1 d1= new Dog1();
		System.out.println("name="+d1.name);
		System.out.println("color="+d1.color);
		System.out.println("breed="+d1.breed);
		System.out.println("cost="+d1.cost);
		System.out.println("----------");
		d1.name="jimmy";
		d1.color="white";
		d1.breed="pug";
		d1.cost=5000;
		System.out.println("name="+d1.name);
		System.out.println("color="+d1.color);
		System.out.println("breed="+d1.breed);
		System.out.println("cost="+d1.cost);
		System.out.println("----------");
		d1.run();
		d1.eat();
			
	}

}
