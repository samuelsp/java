class Casa{
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas(){
		int portasAbertas = 0;
		if(porta1.aberta)
			portasAbertas += 1;
		if(porta2.aberta)
			portasAbertas += 1;		
		if(porta3.aberta)
			portasAbertas += 1;
		return portasAbertas;				
	}
	
	public static void main(String[] args){
		Casa minhaCasa = new Casa();
		minhaCasa.porta1.abre();
		minhaCasa.porta2.fecha();
		minhaCasa.porta3.abre();
		minhaCasa.porta2.abre();
		minhaCasa.pinta("bege");
		System.out.println("Portas abertas na casa: "+minhaCasa.quantasPortasEstaoAbertas());
	}
			
		
}
