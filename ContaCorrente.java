public class ContaCorrente extends Conta{
	void atualiza(double taxa){
		super.atualiza(taxa * 2);
	}

	public void deposita(double valor){
		super.deposita(valor - 0.10);
	}


}