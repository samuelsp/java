class Fibonacci{
	
	int calculaFibonacci(int n){
			return n <= 1 ? 1 : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
		}
			
	public static void main(String[] args){
		Fibonacci fib = new Fibonacci();
		int resultado;
		for(int i = 0; i <= 6; i++){
			resultado = fib.calculaFibonacci(i);
			System.out.print(resultado + " ");
		}
		System.out.println();
	}
}
		
