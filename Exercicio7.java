/* 
 *	class Exercicio7
 *	
 *	Version 1
 *	
 *  Se x é par imprime x / 2, se x é impar imprime 3 * x + 1
 *
 */
 
 class Exercicio7{
 	public static void main(String[] args){
 		int x = 13;
 		while(x > 1){
 			if(x % 2 == 0)
 				x = x / 2; 						
 			else
 				x = 3 * x + 1;
 			System.out.print(x + " ");			
 		}
 		System.out.println();
 	}
 }		
 				
