package com.gft.exercicio2;

public class Main {

	public static void main(String[] args) {
		for(int i = 10;i<=215;i++) {
			if (i % 3 == 0) {
				if(i % 7 == 0) {
					System.out.println(i+" Divisivel por 3 e 7");
				}else {
					System.out.println(i+" Divisivel por 3");
				}
			}else if(i % 7 == 0) {
				if(i % 3 == 0) {
					System.out.println(i+" Divisivel por 3 e 7");
				}else {
					System.out.println(i+" Divisivel por 7");
				}
			}
			
		}
	}

}
