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
			System.out.println("No t� soluci� real.");
		}
		
		if (poli.nombreSolucions() == 1){
			System.out.println("nom�s t� una soluci�");
			System.out.println("unica opci� " + poli.arrealrReal1());
		} else {
			System.out.println("t� dues solucions");
			System.out.println("primera opci� " + poli.calcularfinal1());
			System.out.println("segona opci� " + poli.calcularfinal2());
		}
		System.out.println(" ho�ls " + poli.calcularDiscrimant());
		
		
		
	}

}
