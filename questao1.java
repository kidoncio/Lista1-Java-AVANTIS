/* Escreva um programa que solicite e armazene em variáveis o seu nome, data de nascimento,
endereço e seu número de telefone. Na sequência exiba o conteúdo destas variáveis na tela, e
calcule e apresente também a sua idade. Espera-se que os dados sejam armazenados em
variáveis de tipo adequado ao contexto da informação, como por exemplo a data de
nascimento em uma variável do tipo Calendar.
*/

import java.util.Calendar;
import java.util.Scanner;

public class questao1 {
	
		public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.print("Digite o seu nome: ");
		nome=sc.nextLine();
		
		Calendar dataNasc = Calendar .getInstance();
		Calendar dataAtual = Calendar .getInstance();
		String data;
		int dia;
		int mes;
		int ano;
		dataAtual.set(2016,9,27);
		
		System.out.print("Digite o dia em que você nasceu (DD): ");
		dia = sc.nextInt();
		System.out.print("Digite o mês em que você nasceu (MM): ");
		mes = sc.nextInt();
		System.out.print("Digite o ano em que você nasceu (YYYY): ");
		ano = sc.nextInt();
		
		dataNasc.set(ano, mes, dia);
		
		int idade = dataAtual.get(Calendar.YEAR)- dataNasc.get(Calendar.YEAR);
		
		String numeroDeTelefone;
		
		System.out.print("Digite o número do seu telefone: ");
		numeroDeTelefone = sc.next();
		
		String endereco;
		
		System.out.print("Digite o seu endereço:");
		endereco = sc.next();
		System.out.print("Sr(a) " + nome + ", a sua idade é  " + idade + ", o seu endereço é " + endereco            + ", o seu número de telefone é "+ numeroDeTelefone);
	}
}
