/* 
 *	class Exercicio8
 *	
 *	Version 1
 *	
 *  Imprime n  n * 2  n * 3 ... n * n
 *
 */
 
class Exercicio8{
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){				
			for(int j = 1; j <= i; j++){
				System.out.print((j * i) + " ");
			}
			System.out.println();
		}
	}
}
