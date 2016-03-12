package ru.kpfu.itis.group11506.objects;

public class ComplexNumber {
	
	private double rePart;
	
	private double imPart;

	public ComplexNumber() {
	}
	
	public ComplexNumber(double initRe) {
		setRePart(initRe);
	}
	
	public ComplexNumber(double initRe, double initIm) {
		setRePart(initRe);
		setImPart(initIm);
	}
	
	public void setRePart(double newValue) {
		rePart = newValue;
	}

	public double getImPart() {
		return imPart;
	}

	public void setImPart(double newValue) {
		imPart = newValue;
	}

	public double getRePart() {
		return rePart;
	}
	
	public void plus(ComplexNumber otherNumber) {
		setRePart(getRePart() + otherNumber.getRePart());
		setImPart(getImPart() + otherNumber.getImPart());
	}
	
	public String getNumerAsString() {
		return getRePart() + " + i" + getImPart();
	}
	
	public static void main(String[] args) {
		ComplexNumber complexNumber = new ComplexNumber(1, 1);
		ComplexNumber complexNumber1 = new ComplexNumber(1);

		System.out.println("First complex number:" + 
		complexNumber.getNumerAsString());
		System.out.println("Second complex number:" + 
		complexNumber1.getNumerAsString());
		
		System.out.println("After plus");
		complexNumber.plus(complexNumber1);
		System.out.println("First complex number:" + 
		complexNumber.getNumerAsString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
