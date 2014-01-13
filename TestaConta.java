class TestaConta{
	public static void main(String[] args){
		ContaBancaria conta1 = new ContaBancaria();
		conta1.numero = 123;
		conta1.titular.nome = "Bradley";
		conta1.saldo = 1000;
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.numero = 234;
		conta2.titular.nome = "Michael";
		conta2.saldo = 1000;
		
		
		if(conta1.retirada(1100))
			System.out.println("Operação realizada com sucesso!");
		else
			System.out.println("Saldo insuficiente.");
		
		conta1.deposito(500);
		
		if(conta1.transferePara(conta2, 300))
			System.out.println("Operação realizada com sucesso!");
		else
			System.out.println("Saldo insuficiente.");
		
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
	}
}	
