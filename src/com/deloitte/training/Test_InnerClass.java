package com.deloitte.training;

public class Test_InnerClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.show();
		Outer.Inner oi = o.new Inner();
		oi.show();
		Outer.StaticInner osi = new Outer.StaticInner();
		osi.show();
		class LocalInner {
			void show() {
				System.out.println("Local Inner Class");
			}
		}
		LocalInner li = new LocalInner();
		li.show();
		AnonymousInner ai = new AnonymousInner() {
			@Override
			public void show() {
				System.out.println("Anonymous Inner Class");
			}

			@Override
			public void work() {
				System.out.println("Anonymous Inner Class Working");
			}
			
		};
		ai.show();
	}
	
}

class Outer {
	void show() {
		System.out.println("Outer Class");
	}

	class Inner {
		void show() {
			System.out.println("Inner Class");
			Outer o1 = new Outer();
			o1.show();
		}
	}

	static class StaticInner {
		void show() {
			System.out.println("Static Inner Class");
		}
	}
}

interface AnonymousInner {
	void show();
	void work();
}