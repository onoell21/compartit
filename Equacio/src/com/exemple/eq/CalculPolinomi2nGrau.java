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
		
	}

}
