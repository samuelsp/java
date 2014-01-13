class TestaCarro{
	public static void main(String[] args){
		Carro meuCarro = new Carro();
		meuCarro.cor = "verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		//liga o carro
		meuCarro.liga();
		
		//acelera o carro
		meuCarro.acelera(20);
		
		//pega a marcha
		System.out.println(meuCarro.pegaMarcha());
		
		//velocidade atual do carro
		System.out.println(meuCarro.velocidadeAtual);
	}
	
}
