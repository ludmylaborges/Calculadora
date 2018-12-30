package br.com.cap.calculadora;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.somar(4, 7));
		System.out.println(calculadora.subtrair(2, 2));
		System.out.println(calculadora.multiplicar(5, 5));
		System.out.println(calculadora.dividir(10, 2));
	}

}
