/* Descreva um programa que dado o valor de um produto e o lucro sobre o me
smo, calcule o valor de venda e apresente na tela os dados detalhados.
*/

package lista1;

import java.util.Scanner;

public class questao4 {
	  public static void main (String[]args){

		  float valorProduto,margemLucro,valorVenda,margem = 0;
		  
	      Scanner sc = new Scanner(System.in);
		  System.out.println("Esse programa efetua o cálculo do Valor da Venda de algum produto baseado na margem de lucro escolhida. \n");
		  System.out.println("Digite o valor do produto: ");
		  valorProduto = sc.nextFloat();
		  
		  System.out.println("Digite a margem de lucro desejada em %: ");
		  margemLucro = sc.nextFloat();
		  
		  margem = (valorProduto*margemLucro)/100;
		  valorVenda = margem+valorProduto;
		  
		  System.out.println("Valor do produto: "+valorProduto);
		  System.out.println("Porcentagem de Lucro sobre o produto: "+margemLucro);
		  System.out.println("Valor da Margem de Lucro: "+margem);
		  System.out.println("\nValor de venda do produto: "+valorVenda);		  		 	  
	  }
}
