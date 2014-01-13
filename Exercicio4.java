/* 
 *	class Exercicio4
 *	
 *	Version 1
 *	
 *  Imprime os fatoriais de 0 até 10
 */
 
 class Exercicio4{
 	public static void main(String[] args){
 		int fatorial = 1; 		
 		for(int n = 0, i = 0; n <= 10; n++, i++){
 			fatorial *=  n;
 			if(n == 0){
 				fatorial = 1; 				
 			}
 			System.out.println("fatorial("+i+") = "+fatorial);
 		} 		
 	}
 }
 			 
 			
 		
 		
