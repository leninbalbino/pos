package br.inatel.pos;

public abstract class Conta implements Atualizacao {

	private int numero;
	private String cliente;
	private float saldo;
	
	public Conta(int numero, String cliente) {
		
		this.cliente = cliente;
		this.numero = numero;		
	};
	
	public void sacar(float valor) {
		
	};
	
	public boolean depositar(float valor) {
		
		return false;
	};
	
	public void transferirPara(Conta c, float valor) {
		
	};
	
	public float getSaldo() {
		
		return saldo;
	}
	
	public int getNumero() {
		
		return numero;
	}
	
}
