import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario,salarioTotal,hora,valorHoraExtra,horasExtras;
		System.out.println("digite o seu salario ");
		salario=sc.nextFloat();
		hora=salario/220;
		valorHoraExtra=hora+(hora*50)/100;
		System.out.println("digite o valor de horas extras realizadas no mês  ");
		horasExtras= sc.nextFloat();
		horasExtras=valorHoraExtra*horasExtras;
		salarioTotal=horasExtras+salario;
		System.out.println("seu salario e de = " + salario + " "+ "Valor hora = "+ " "+ hora);
		System.out.println("Valor de uma hora extra " + " "+valorHoraExtra+" "+"valor total de horas extras "+" "+horasExtras); 
		System.out.println(" salario total " + salarioTotal);
	}

}
