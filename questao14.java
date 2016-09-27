/* O tempo para o dia seguinte na cidade de Balneário Camboriú é bem regular e fácil de prever. 
O meteorologista da cidade criou uma tabela para prever se haverá chuva no dia seguinte a 
partir de quatro variáveis cujo valor depende das condições meteorológicas do dia anterior.
Sendo estas: V - se está ventando; F – se faz frio; U – se está úmido; e, N – se está nublado. 
As  quatro  variáveis  são  medidas  pelo  meteorologista  e  ele  atribui  um  valor  0  (falso)  ou  1 
(verdadeiro) para cada uma delas. O resultado da previsão de chuva para amanhã é visto que em Balneário Camboriú: função lógica de
V (vento hoje), F (frio hoje), U (dia úmido hoje) e N (nublado hoje).
Sabendo  disso,  faça  um  programa  que  a  partir  dos  valores  informados  para  as  variáveis, 
determine se irá chover amanhã em Balneário Camboriú.
*/

package lista1;

import java.util.Scanner;

public class questao14 {
	  public static void main (String[]args){

		  int V, F, U, N, previsao;
		  
	      Scanner sc = new Scanner(System.in);

		  System.out.println("Bem Vindo ao Programa para a previsão do tempo! \n");
		  System.out.println("Digite 1 para caso a resposta seja VERDADEIRA e 0 para caso ela seja FALSA.");
		  
		  System.out.println("Caro usuário, hoje está ventando?");
		  V = sc.nextInt();
		  if((V != 0) && (V != 1)){
			  System.out.println("Por favor, as respostas devem apenas ser baseadas em 0 e 1. Sendo 0 para FALSO e 1 para VERADEIRO.");
		  }
		  
		  
		  System.out.println("Hoje está frio?");
		  F = sc.nextInt();
		  if((F != 0) && (F != 1)){
			  System.out.println("Por favor, as respostas devem apenas ser baseadas em 0 e 1. Sendo 0 para FALSO e 1 para VERADEIRO.");
		  }
		  
		  System.out.println("O clima hoje, está úmido?");
		  U = sc.nextInt();
		  if((U != 0) && (U != 1)){
			  System.out.println("Por favor, as respostas devem apenas ser baseadas em 0 e 1. Sendo 0 para FALSO e 1 para VERADEIRO.");
		  }
		  
		  System.out.println("Hoje está nublado?");
		  N = sc.nextInt();
		  if((N != 0) && (N != 1)){
			  System.out.println("Por favor, as respostas devem apenas ser baseadas em 0 e 1. Sendo 0 para FALSO e 1 para VERADEIRO.");
		  }
		  
		  
		  System.out.println("\nA previsão do tempo para amanhã é: ");
		  if((V == 1) && (F == 1) && (U == 1) && (N == 1)){
			  System.out.println("Tempo chuvoso em Balneário Camboriú.");
		  }
		  else{
			  System.out.println("Amanhã não irá chover em Balneário Camboriú.");
		  }
		
	  }
}
