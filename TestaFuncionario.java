class TestaFuncionario{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.bonifica(50);
		f1.setDepartamento("Contabilidade");
		f1.setRG("8965412-85");
		f1.setEstaNaEmpresa(true);
		f1.setDataEntrada(30, 3, 1999);		
		
		f1.mostra();
		System.out.println("Identificador: "+f1.getIdentificador());				
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Hugo");
		f2.setSalario(100);
		f2.bonifica(50);
		System.out.println("Identificador: "+f2.getIdentificador());
		
		Funcionario f3 = f2;
		Funcionario f4 = new Funcionario();
		System.out.println("Identificador: "+f4.getIdentificador());
		
		
		
		if(f2 == f3)
			System.out.println("São iguais.");
		else
			System.out.println("Não são iguais.");
		
	}
}
		
