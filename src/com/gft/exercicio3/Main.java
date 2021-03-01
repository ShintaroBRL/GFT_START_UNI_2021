package com.gft.exercicio3;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Intervalo inicial: ");
		int intervaloInicial = scanner.nextInt();
		System.out.print("Intervalo final: ");
		int intervaloFinal = scanner.nextInt();
		int intervalo = intervaloFinal-intervaloInicial;
		System.out.println("Intervalo de: "+intervalo);
		
		if(intervalo > 15) {
			System.out.println("Intervalo invalido: "+intervalo+"\nO intervalo deve ser menor que 15.");
			return;
		}
		
		for(int i = intervaloInicial;i<=intervaloFinal;i++) {
			System.out.println(i+"^3 = "+ Math.pow(i, 3));
		}
		
	}

}
