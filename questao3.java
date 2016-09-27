// Escreva um programa que determine se um número digitado pelo usuário é ímpar ou par.

package lista1;

import java.util.Scanner;

public class questao3 {
	  public static void main (String[]args){

		  char jogador1 = 'X';
		  char jogador2 = 'O';
		  char[][] tabuleiro = new char[3][3];
		  char[][] tabuleiro2 = new char[3][3];
		  
	      Scanner sc = new Scanner(System.in);

	      System.out.println("Bem vindo ao Jogo da Velha!");
	      System.out.println("Jogador 1: X");
	      System.out.println("Jogador 2: O");
	      System.out.println("Ao analisarmos esse jogo: \n");
	      
	      tabuleiro[0][0] = 'X';
		  tabuleiro[0][1] = '0';
		  tabuleiro[0][2] = 'X';
		  tabuleiro[1][0] = '0';
		  tabuleiro[1][1] = '0';
		  tabuleiro[1][2] = 'X';
		  tabuleiro[2][0] = 'X';
		  tabuleiro[2][1] = '0';
		  tabuleiro[2][2] = 'X';

	    //Imprime para o usuário o Tabuleiro2 para ele JOGAR.      

	      int i = 0;
	      int j = 0;
	      int valorTabuleiro = 3;
	      
	      for(i=0; i<valorTabuleiro; i++){ //Aqui faz com que as posições da coluna sejam colocadas.
	    	  System.out.print(i+"\t");
	      }
	      System.out.println("\n");
	      for(i=0; i<valorTabuleiro; i++){
	          for(j=0; j<valorTabuleiro; j++){
	    	      System.out.print(tabuleiro[i][j]+"\t");
	          }
	          System.out.print("|"+i);
    	      System.out.println("\n");
	      }      
	     
	     System.out.println("Podemos ver que houve empate!");
  } 
}
