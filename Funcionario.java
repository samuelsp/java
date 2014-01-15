class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	private static int identificador;
	
	public Funcionario(){
		Funcionario.identificador += 1;
	}
	
	public Funcionario(String nome){
		Funcionario.identificador += 1;
		this.nome = nome;	
	}
	
	public int getIdentificador(){
		return Funcionario.identificador;
	}
	
	void bonifica(double aumento){
		this.salario += aumento;		
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void demite(){
		this.estaNaEmpresa = false;		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
		
	public void setSalario(int salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setDataEntrada(int dia, int mes, int ano){
		dataEntrada = new Data(dia, mes, ano);
	}
	
	public String getDataEntrada(){
		return this.dataEntrada.mostraData();
	}
	
	public void setRG(String rg){
		this.rg = rg;
	}
	
	public String getRG(){
		return this.rg;
	}
	
	public void setEstaNaEmpresa(boolean estaNaEmpresa){
		this.estaNaEmpresa = estaNaEmpresa;
	}	
		
	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}
	
	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario: "+this.salario);
		System.out.println("Data de Entrada: "+this.dataEntrada.mostraData());
		System.out.println("RG: "+this.rg);
		System.out.println(estaNaEmpresa?"Esta na empresa: Sim":"Esta na empresa: Não");		
		System.out.println("Ganho Anual: "+this.calculaGanhoAnual());
	}	

}

class Data{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		if(validar(dia, mes, ano)){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
				
	private boolean validar(int dia, int mes, int ano) {
		if(mes == 2 && dia > 29)
			return false;
		else
			return true;
	}				
	
	String mostraData(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}	
}

class Empresa{
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int index = 0;
	
	public Empresa(){};
	
	public Empresa(int tamanho){
		empregados = new Funcionario[tamanho];
	}
	
	public int getTamanhoEmpregados(){
		return this.empregados.length;
	}	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCNPJ(String cnpj){
		this.cnpj = cnpj;
	}
	
	public String getCNPJ(){
		return this.cnpj;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.empregados[posicao];
	}
	
	public void adiciona(Funcionario f){
		try{
			this.empregados[index] = f;
			index += 1;							
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Não é possível incluir novos empregados. Limite atingido.");
		}
	}
	
	public void mostraEmpregados(){
		for(Funcionario f: empregados)
			System.out.println(f);
	}
	
	public void exibeSalarios(){
		for(Funcionario f: empregados)
			System.out.println(f.getSalario());
	} 
	
	public boolean contem(Funcionario f){
		for(Funcionario e: empregados){
			if(e == f)
				return true;
		}
		return false;
	}
	
}		
	
	
		
		
