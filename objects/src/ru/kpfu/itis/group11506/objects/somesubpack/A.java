package ru.kpfu.itis.group11506.objects.somesubpack;

public class A {
	
	{
		System.out.println("Block");
	}
	
	public A() {}
	
	public A(int a) {
		System.out.println(a);
	}
	
	public void show() {
		System.out.println("A:show");
	}

	public static void main(String[] args) {
//		new B(1);
		
		A a = new B();
		a.show();
		
	}
	
}

class B extends A {

	public B(){}
	
	public B(int a) {
		super();
//		super(a);
		System.out.println("B");
	}
	
	public void show(){
		super.show();
		System.out.println("B:show");
	}

}


