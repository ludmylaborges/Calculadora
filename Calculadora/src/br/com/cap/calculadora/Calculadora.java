package br.com.cap.calculadora;

public class Calculadora {
	
	private float  numero1;
	private float numero2;
	
	
	public Calculadora(float numero1, float numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
		
		public Calculadora() {
			super();
			this.numero1 = 0;
			this.numero2 = 0;	
		
	}
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	public float somar(float numero1, float numero2) {
	 return numero1 + numero2; 
	
	}
	
	public float subtrair(float numero1, float numero2) {
		 return numero1 - numero2; 
	}
	
	public float multiplicar(float numero1, float numero2) {
		 return numero1 * numero2; 
	}
	
	public float dividir(float numero1, float numero2) {
		 return numero1 / numero2; 
	}	 
		
		 
		
	
}
