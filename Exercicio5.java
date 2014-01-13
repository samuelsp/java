/* 
 *	class Exercicio5
 *	
 *	Version 1
 *	
 *  Imprime os fatoriais de 0 até 20
 *
 */

class Exercicio5{
	public static void main(String[] args){
		long fatorial = 1;
		for(int n = 0; n <= 20; n++){
			fatorial *= n;
			if(n == 0){
				fatorial = 1;
			}
			System.out.println("fatorial("+n+") = " + fatorial);
		}
	}
}
