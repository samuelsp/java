class TestaFuncionario{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.bonifica(50);
		f1.departamento = "Contabilidade";
		f1.rg = "8965412-85";
		f1.estaNaEmpresa = true;
		f1.dataEntrada = new Data();			
		f1.dataEntrada.dia = 12;
		f1.dataEntrada.mes = 9;
		f1.dataEntrada.ano = 1999;
		
		f1.mostra();				
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Hugo";
		f2.salario = 100;
		f2.bonifica(50);
		
		Funcionario f3 = f2;
		
		if(f2 == f3)
			System.out.println("São iguais.");
		else
			System.out.println("Não são iguais.");
		
	}
}
		
