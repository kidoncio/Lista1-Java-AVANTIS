/* Escreva um programa que calcule a expressão lógica, sendo que o usuário deverá informar os 
valores para as variáveis.  
((X >= Y) AND (Z <=X)) OR ((X == W) AND (Y == Z)) OR (NOT(X != W))
*/

package lista1;

import java.util.Scanner;

public class questao13 {
	  public static void main (String[]args){

		  int X,Y,Z,W;
		boolean resultado;
		  
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Olá!\n");
		  System.out.println("Esse programa resolve uma expressão lógica. \n");
		  System.out.println("As variáveis são: X, Y, Z e W.");
		  System.out.println("Digite números inteiros para que isso seja soluciado\n");
		  
		  System.out.println("Digite um número inteiro para a variável X:");
		  X = sc.nextInt();
		  		  
		  
		  System.out.println("Digite um número inteiro para a variável Y:");
		  Y = sc.nextInt();
		  
		  
		  System.out.println("Digite um número inteiro para a variável Z:");
		  Z = sc.nextInt();
		
		  
		  System.out.println("Digite um número inteiro para a variável W:");
		  W = sc.nextInt();
		    
		  resultado=((X>=Y) && (Z<=X)) || ((X == W) && (Y == Z)) || ((X != W));
		  
		  System.out.println("O resultado, de acordo com as suas variáveis, foi: "+resultado);
	  }
}
