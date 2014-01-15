class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa(10);
		Empresa empresa2 = new Empresa();
		//empresa.empregados = new Funcionario[10];
		
		for(int i = 0; i < empresa.getTamanhoEmpregados(); i++){
			Funcionario f = new Funcionario();
			f.setSalario(1000 + i * 100);
			empresa.adiciona(f);
		}
		
		empresa.mostraEmpregados();			
		empresa.exibeSalarios();
										
	}

}
