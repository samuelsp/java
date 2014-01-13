public class FibonacciArray{ 
	int[] array = new int[100];	
	static int i;
	
	int calculaFibonnaci(int n){
      	  	
      if(n == 0){
         this.array[0] = 1;
      	 return this.array[0];
      }
      
      else if(n == 1){
         this.array[1] = 1;
      	 return this.array[1];
      }      
      
      else{ 
      	this.array[i] = this.array[n - 1] + this.array[n - 2];      	
      	return this.array[i];
      }      
      
    }
  
	public static void main(String[] args){
		FibonacciArray fib = new FibonacciArray();
		for(i = 0; i < 10; i++){			
			System.out.print(fib.calculaFibonnaci(i) + " ");				
		}
		System.out.println();	
				
	}		

}
