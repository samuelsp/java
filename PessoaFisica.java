public class PessoaFisica{
	
	private String cpf;
		
	public PessoaFisica(String cpf){
		if(validaCPF(cpf))
			this.cpf = cpf;
		else
			this.cpf = "nononono";
	}
	
	private boolean validaCPF(String cpf){
		if(cpf == null || cpf == " ")
			return false;
		else
			return true;
	} 
	
	public String getCPF(){
		return this.cpf;
	}
	
	public static void main(String[] args){
		PessoaFisica p1 = new PessoaFisica("0123");
		System.out.println(p1.getCPF());
	}	

}
