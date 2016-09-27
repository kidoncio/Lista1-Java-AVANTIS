// Escreva um programa que leia um número inteiro e o classifique como positivo, negativo ou 
// zero.

package lista1;

import java.util.Scanner;

public class questao9 {
	  public static void main (String[]args){

		  int numero;
		  
	      Scanner sc = new Scanner(System.in);

		  
		  System.out.println("Digite um número inteiro");
		  numero = sc.nextInt();
		  
		  System.out.println("Você digitou: "+numero);
		  if(numero>0){
			  System.out.println("Esse número é positivo.");
		  }
		  else if(numero==0){
			  System.out.println("Esse número é zero.");
		  }
		  else{
			  System.out.println("Esse número é negativo.");
		  }
		  
	  }
}
