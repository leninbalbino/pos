package br.inatel.pos;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, String cliente) {
		super(numero, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualizarSaldo() {
		// TODO Auto-generated method stub
		
	}

	private float taxaDeJuros(){
		
		return 0;
	};
	
}
