/*
Descreva programa para calcular o salário de um funcionário. Considerar que o mesmo
trabalha 30 dias por mês e 8 horas por dia. No entanto, o funcionário pode realizar horas
extras, neste caso solicite o número de total de horas extras realizadas no mês. Considerar que
as horas extras valem 50% a mais do que as horas trabalhadas normalmente. Informe os dados
detalhados na tela.
*/

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
  
		Scanner sc = new Scanner(System.in);
    
		float salario, salarioTotal, hora, valorHoraExtra, horasExtras;
		System.out.print("Digite o seu salário: ");
		salario=sc.nextFloat();
    
		hora=salario/220;
		valorHoraExtra=hora+(hora*50)/100;
    
		System.out.print("Digite a quantidade de horas extras realizadas neste mês:  ");
		horasExtras= sc.nextFloat();
    
		horasExtras=valorHoraExtra*horasExtras;
		salarioTotal=horasExtras+salario;
    
		System.out.println("O seu salário é de: " + salario +"\n"+"Valor/hora = "+ hora);
		System.out.println("O valor de uma hora extra: "+ valorHoraExtra +"\n"+"Valor total de horas extras: "+ horasExtras); 
		System.out.println("\nSalário total:"+ salarioTotal);
	}

}
