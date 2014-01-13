class Pessoa{
	String nome;
	int idade;
	
	void fazAniversario(){
		System.out.println(this.nome + " tem " + this.idade + " anos.");
	}
	
	public static void main(String[] args){
		Pessoa p1 = new Pessoa();
		p1.nome = "João";
		p1.idade = 23;
		p1.idade += 1;
		p1.idade += 1;
		p1.idade += 1;
		p1.fazAniversario();
	}
	
}
