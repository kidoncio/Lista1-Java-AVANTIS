/* Escreva  um  programa  que  leia  as  3  notas  de  um  aluno  e  calcule  a  média  final  deste  aluno. 
Considerar que a média é ponderada e que o peso das notas são: 2, 3 e 5 respectivamente.
*/

package lista1;

import java.util.Scanner;

public class questao12 {
	  public static void main (String[]args){

		  float nota1,nota2,nota3,resultado = 0;
		  
	      Scanner sc = new Scanner(System.in);
		  System.out.println("Esse programa calcula a média do aluno. \n");
		  System.out.println("Cada nota possui um peso diferente.");
		  System.out.println("Nota 1: PESO 2.");
		  System.out.println("Nota 2: PESO 3.");
		  System.out.println("Nota 3: PESO 5.");
		  		  
		  System.out.print("\nDigite a 1ª nota do aluno: ");
		  nota1 = sc.nextFloat();
		  nota1 = nota1*2;  
		  
		  System.out.print("\nDigite a 2ª nota do aluno: ");
		  nota2 = sc.nextFloat();
		  nota2 = nota2*3;
		  
		  System.out.print("\nDigite a 3ª nota do aluno:");
		  nota3 = sc.nextFloat();
		  nota3 = nota3*5;
		  
		  resultado = (nota1+nota2+nota3)/(2+3+5);
		  
		  System.out.println("\nA média final do aluno é: "+resultado);
	  }
}
