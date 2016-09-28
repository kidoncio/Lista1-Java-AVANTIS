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
		System.out.print("Entre com o dia em que você nasceu: ");
		dia=sc.nextInt();
		System.out.print("Entre com o mês em que você nasceu: ");
		mes=sc.nextInt();
		System.out.println("Entre com o ano em que você nasceu: ");
		ano=sc.nextInt();
		dataNasc.set(ano, mes, dia);
		int idade=dataAtual.get(Calendar.YEAR)- dataNasc.get(Calendar.YEAR);
		
    System.out.println("\n");
		int numeroDeTelefone;
		System.out.print("Digite o número do seu telefone: ");
		numeroDeTelefone= sc.nextInt();
		
		String endereco;
		System.out.println("entre com seu endereço");
		endereco=sc.next();
		System.out.println("Sr(a)  " + nome + ", a sua idade é  " + idade + "; o seu endereco é " + endereco            + "; o seu numero de telefone é  "+ numeroDeTelefone++);
	}
}
