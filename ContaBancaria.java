class ContaBancaria{
	int numero;	
	double saldo;
	Cliente titular = new Cliente();
	
	void deposito(double valor){
		this.saldo += valor;
	}
	
	boolean retirada(double valor){
		if(this.saldo < valor)
			return false;
		else
			this.saldo -= valor;
		return true;	
	}
	
	boolean transferePara(ContaBancaria destino, double valor){
		boolean retirada = retirada(valor);
		if(retirada){
			destino.deposito(valor);
			return true;
		}
		else			
			return false;		
	}

}


	
