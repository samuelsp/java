class Funcionario{
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	
	void bonifica(double aumento){
		this.salario += aumento;		
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void demite(){
		this.estaNaEmpresa = false;		
	}
	
	String getNome(){
		return this.nome;
	}
	
	String getDepartamento(){
		return this.departamento;
	}
	
	double getSalario(){
		return this.salario;
	}
	
	Data getDataEntrada(){
		return this.dataEntrada;
	}
	
	String getRG(){
		return this.rg;
	}
		
	boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}
	
	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario: "+this.salario);
		System.out.println("Data de Entrada: "+this.dataEntrada.mostraData());
		System.out.println("RG: "+this.rg);
		System.out.print("Esta na Empresa? ");
		if(estaNaEmpresa)
			System.out.print("Sim \n");
		else
			System.out.print("Não \n");
		System.out.println("Ganho Anual: "+this.calculaGanhoAnual());
	}	

}

class Data{
	int dia;
	int mes;
	int ano;
	
	String mostraData(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}	
}

class Empresa{
	String nome;
	String cnpj;
	Funcionario[] empregados;
	int index = 0;
	
	void adiciona(Funcionario f){
		try{
			this.empregados[index] = f;
			index += 1;							
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Não é possível incluir novos empregados. Limite atingido.");
		}
	}
	
	void mostraEmpregados(){
		for(Funcionario f: empregados)
			System.out.println(f);
	}
	
	void exibeSalarios(){
		for(Funcionario f: empregados)
			System.out.println(f.salario);
	} 
	
	boolean contem(Funcionario f){
		for(Funcionario e: empregados){
			if(e == f)
				return true;
		}
		return false;
	}
	
}		
	
	
		
		
