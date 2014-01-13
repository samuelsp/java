/* 
 *	class Exercicio6
 *	
 *	Version 1
 *	
 *  Imprime a série Fibonacci de 0 até 101
 *
 */
 
class Exercicio6{
	public static void main(String[] args){
		long fib = 0;
		long result = 0;
		long temp;
		for(int n = 0; n <= 101; n++){
			if(n == 0)
				fib = 0;			
			else if(n == 1)
				fib = 1;					
			else
				fib += result;			
			System.out.println("fibonacci("+n+") = " + fib);
			temp = fib;
			fib = result;
			result = temp;				  
				
		}
	}
}
				
			
			
	
