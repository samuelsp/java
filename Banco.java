public class Banco{
	private Conta[] conta;
	private int i = 0;
	private int totalContas = 0;

	public Banco(int tamanhoArray){
		this.conta = new Conta[tamanhoArray];
	}

	public void adiciona(Conta c){
		conta[i] = c;
		i += 1;
		totalContas += 1;
	}

	public Conta pegaConta(int x){
		return this.conta[x];
	}

	public int pegaTotalDeContas(){
		return this.totalContas;
	}

	public static void main(String[] args) {
			Banco banco = new Banco(10);			

			for(int i = 0; i < 10; i++){
				if(i < 3){
					Conta c = new Conta();
					banco.adiciona(c);
					c.deposita(1000);
				}

				else if(i >= 3 && i < 6){
					Conta cc = new ContaCorrente();
					banco.adiciona(cc);
					cc.deposita(1000);
				}

				else{
					Conta cp = new ContaPoupanca();
					banco.adiciona(cp);
					cp.deposita(1000);
				}
				
			}

			//System.out.println(banco.pegaTotalDeContas());

			AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

			for(int j = 0; j < banco.conta.length; j++){
				adc.roda(banco.pegaConta(j));
			}

			System.out.println(adc.getSaldoTotal());

		}

}