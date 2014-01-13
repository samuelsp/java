class Carro{
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor = new Motor();
	
	//ligar o carro
	void liga(){
		System.out.println("O carro esta ligado.");
	}
	
	//acelera o carro
	void acelera(double quantidade){
		double novaVelocidade = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = novaVelocidade;
	}
	
	//devolve a marcha do carro
	int pegaMarcha(){
		if(this.velocidadeAtual < 0)
			return -1;
		else if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40)
			return 1;
		else if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80)
			return 2;
		else
			return 3;
	}
	
}
		
