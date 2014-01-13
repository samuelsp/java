class Porta{
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre(){
		this.aberta = true;
	}
	
	void fecha(){
		this.aberta = false;
	}
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	boolean estaAberta(){
		return this.aberta;
	}
	
	public static void main(String[] args){
		Porta porta1 = new Porta();
		porta1.pinta("branco");
		porta1.pinta("amarelo");
		porta1.pinta("azul");
		porta1.dimensaoX = 12;
		porta1.dimensaoY = 14;
		porta1.dimensaoX = 10;	
		
		porta1.fecha();
		
		if(porta1.estaAberta())
			System.out.println("A porta esta aberta.");
		else
			System.out.println("A porta esta fechada.");
		
		System.out.println("A cor da porta é " + porta1.cor + ".");
	}
	
}
			
		
			
		
