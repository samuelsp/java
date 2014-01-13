class FibonacciArray{
	int[] fib = new int[6];
	int i = 0;
	
	void calculaFibonacci(int n){
		if(n == 0 || n == 1){
			fib[i] = 1;
			i += 1;			
		}else{
			fib[i] = calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
			i += 1;
		}
	}

	public static void main(String[] args){
		FibonacciArray f = new FibonacciArray();
		for(int i = 0; i < 6; i++)
			f.calculaFibonacci(i);	
				
	}		

}
