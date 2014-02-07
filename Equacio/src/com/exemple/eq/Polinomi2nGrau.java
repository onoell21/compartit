package com.exemple.eq;

public class Polinomi2nGrau {
	int a;
	int b;
	int c;
	
	public Polinomi2nGrau(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int calcularDiscrimant(){
		
		return b*b - (4*a*c);
		
	}
	
	public String toString(){
	
		String total = Integer.toString(a) + "x2 + " + Integer.toString(b) + "x + " + Integer.toString(c);
		
		return total;
		
	}
	
	public boolean arrelsReals(){
		if(calcularDiscrimant()>=0){
			return true;
		} else{
			return false;
		}
	}
	
	public int nombreSolucions(){
		if(calcularDiscrimant()==0){
			return 1;
		} else{
			return 2;
		}
	}
	
	public float arrealrReal1(){
		return (float) Math.sqrt(calcularDiscrimant());
	}
	
	public float arrealrReal2(){
		return - ((float) Math.sqrt(calcularDiscrimant()));
		//això és un canvi
	}

}
