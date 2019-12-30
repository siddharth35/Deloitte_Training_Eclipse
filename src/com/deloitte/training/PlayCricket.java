package com.deloitte.training;

public class PlayCricket {
	public static void main(String[] args) {
		Pacer p1 = new Pacer("Siddharth");
		p1.bowl();
		Spinner s1 = new Spinner("Shankar");
		s1.bowl();
	}
}

abstract class Player {
	String name;

	Player(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " is Running");
	}
}

abstract class Batsman extends Player {

	Batsman(String name) {
		super(name);
	}

	public abstract void bat();
}

class Opener extends Batsman {

	Opener(String name) {
		super(name);
	}

	@Override
	public void bat() {
		System.out.println(name + " is Batting as an Opener");
	}
}

class MidOrder extends Batsman {

	MidOrder(String name) {
		super(name);
	}

	@Override
	public void bat() {
		System.out.println(name + " is Batting in the MidOrders");
	}
}

abstract class Bowler extends Player {
	Bowler(String name) {
		super(name);
	}

	public abstract void bowl();
}

class Pacer extends Bowler {
	Pacer(String name) {
		super(name);
	}

	@Override
	public void bowl() {
		System.out.println(name + " is Bowling a Pace Ball");
	}
}

class Spinner extends Bowler {
	Spinner(String name) {
		super(name);
	}

	@Override
	public void bowl() {
		System.out.println(name + " is Bowling a Spin Ball");
	}
}