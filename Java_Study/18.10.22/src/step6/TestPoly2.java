﻿package step6;

class Animal{
	public void eat() {
		System.out.println("먹다");
	}	
	public void play() {
		System.out.println("놀다");
	}	
}

class Monkey extends Animal {
	public void play() {
		System.out.println("나무타고 놀다");
	}
}

class Tiger extends Animal{
	public void play() {
		System.out.println("어흥하고 놀다");
	}
	
}

class Person extends Animal{
	public void play() {
		System.out.println("동물을 구경하며 놀다");
	}
	public void ticketing() {
		System.out.println("입장권을 구매하다");
	}
}

class ZooMgr {
	public void enter(Animal a) {
		if(a instanceof Person) {
			Person p = (Person)a;
			p.ticketing();
		}
		a.eat();
		a.play();
	}
}

public class TestPoly2 {
	public static void main(String[] args) {
		ZooMgr zoo = new ZooMgr();
		zoo.enter(new Monkey());
		System.out.println();
		
		zoo.enter(new Tiger());
		System.out.println();
		
		zoo.enter(new Person());
	}
}
