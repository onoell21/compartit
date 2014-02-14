package com.exemple.eq;

import java.util.Scanner;

public class CalculPolinomi2nGrau {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entra a");
		a = s.nextInt();
		System.out.println("Entra b");
		b = s.nextInt();
		System.out.println("Entra c");
		c = s.nextInt();
		
		Polinomi2nGrau poli = new Polinomi2nGrau(a, b, c);
		System.out.println(poli);
		
		if(!poli.arrelsReals()){
			System.out.println("No té solució real.");
		}
		
		if (poli.nombreSolucions() == 1){
			System.out.println("només té una solució");
			System.out.println("unica opció " + poli.arrealrReal1());
		} else {
			System.out.println("té dues solucions");
			System.out.println("primera opció " + poli.calcularfinal1());
			System.out.println("segona opció " + poli.calcularfinal2());
		}
		System.out.println(" hoñls " + poli.calcularDiscrimant());
		
		
		
	}

}
