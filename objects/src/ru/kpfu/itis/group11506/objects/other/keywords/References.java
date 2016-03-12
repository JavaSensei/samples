package ru.kpfu.itis.group11506.objects.other.keywords;

public class References extends SuperReferences {

	private int a;

	private int b;

	public References(int a) {
		if (a > 0) {
			this.a = a;
		}
	}

	public References(int a, int b) {
		this(a);
		this.b = b;
	}

	public void show() {
		System.out.println(a + " " + b);
	}

	@Override
	public int doSomething() {
		int i = super.doSomething();
		return ++i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
