import java.util.Calendar;
import java.util.Scanner;

public class TarefaCalendar {
	
		public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("digite seu nome");
		nome=sc.nextLine();
		
		Calendar dataNasc = Calendar .getInstance();
		Calendar dataAtual = Calendar .getInstance();
		String data;
		int mes;
		int ano;
		int dia;
		dataAtual.set(2016,9,14);
		System.out.println("entre com seu dia de nascimento");
		dia=sc.nextInt();
		System.out.println("entre com o seu mes de nascimento");
		mes=sc.nextInt();
		System.out.println("entre com o ano de nascimento");
		ano=sc.nextInt();
		dataNasc.set(ano, mes, dia);
		int idade=dataAtual.get(Calendar.YEAR)- dataNasc.get(Calendar.YEAR);
		
		int numeroDeTelefone;
		System.out.println("entre com numero de telefone");
		numeroDeTelefone= sc.nextInt();
		
		String endereco;
		System.out.println("entre com seu endereço");
		endereco=sc.next();
		System.out.println("sr(a)  " + nome + " sua idade é  " + idade + " seu endereco é " + endereco            + " seu numero de telefone é  "+ numeroDeTelefone++);
	}
}
