package br.senai.sp.jandira;

import java.util.Scanner;

public class CalcularImc {

	public static void main(String[] args) {
		
		System.out.println("Qual seu nome?");
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		nome = teclado.next();
		
		System.out.println("Qual seu peso?");
		Scanner peso = new Scanner(System.in);
		double kg;
		kg = peso.nextDouble();
		
		System.out.println("Qual sua altura?");
		Scanner alt = new Scanner(System.in);
		double altu;
		altu = alt.nextDouble();
		
		double base;
		base = altu*altu;
		double imc = kg/base;
		
		System.out.println("Olá " + nome +" seu IMC é " + imc);

	}

}
