package lista1;

import java.util.Scanner;

public class questao7 {
	public static void main(String[] args) {

		System.out.println("Bem vindo ao programa de cálculo de FÉRIAS! \n");

		System.out.println(
				"De acordo com a CLT, quem possui carteira assinada, 30 dias de férias depois de completar 12 meses na mesma organização\n\n");

		float tempoTrabalho = 0, vencimentoFerias = 0, feriasVendidas = 0, ferias = 30,	periodoFerias = 0, abonoConstitucional = 0, abonoPecuniario = 0, valorFeriasVendidas = 0;
		float salario;
		char opcao;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário do usuário: ");
		salario = sc.nextFloat();

		System.out.println("O usuário completou 12 meses na mesma organiação? ( S ou N )");
		opcao = sc.next().charAt(0);

		if (opcao == 'S' || opcao == 's') {
			tempoTrabalho = 12;
		} else {
			System.out.print("Digite quanto tempo o usuário possui na mesma organização: ");
			tempoTrabalho = sc.nextInt();
		}

		if (tempoTrabalho < 12) {
			System.out.println("O usuário deseja vender parte de suas férias? ( S ou N )");
			opcao = sc.next().charAt(0);

			if (opcao == 's' || opcao == 'S') {
				System.out.println("Quantos dias de suas férias o usuário quer vender? ");
				feriasVendidas = sc.nextInt();

				if (feriasVendidas <= 10) {
					System.out.println("O usuário deseja dividir suas férias em dois períodos? ( S ou N )");
					opcao = sc.next().charAt(0);

					if (opcao == 's' || opcao == 'S') {
						System.out.print("Digite a quantidade de dias que o primeiro período de férias terá: ");
						periodoFerias = sc.nextInt();

						ferias = ferias - feriasVendidas;
						System.out.println(
								"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
						System.out.println(
								"Quando o usuário completar 12 meses registrado nessa organização, ele terá direito a "
										+ ferias + " dias de férias.");
						System.out.println("O usuário decidiu vender " + feriasVendidas + " dias de suas férias.");
						System.out
								.println("O  primeiro período de férias terá um total de: " + periodoFerias + " dias.");
						ferias = ferias - periodoFerias;
						System.out.println("O segundo período de férias terá um total de: " + ferias + " dias.");
					}
				}
			} else {
				System.out.println("Só é possível vender até no máximo 10 dias de suas férias.");
			}

		}
		if (tempoTrabalho == 12) {
			System.out.println("\nO usuário completou 12 meses estando registrado na mesma organização.");

			System.out
					.print("Digite o tempo de trabalho que o empregado possui desde o vencimento das últimas férias: ");
			vencimentoFerias = sc.nextInt();

			if (vencimentoFerias == 12) {
				System.out.println("O usuário gostaria de vender parte de suas férias? (S ou N)");
				opcao = sc.next().charAt(0);

				if (opcao == 's' || opcao == 'S') {
					System.out.println("Quantos dias de suas férias o usuário quer vender?");
					feriasVendidas = sc.nextInt();

					abonoConstitucional = salario/3;
					abonoPecuniario = salario/30;
					valorFeriasVendidas = feriasVendidas*abonoPecuniario;
					
					if (feriasVendidas <= 10) {
						System.out.println("O usuário gostaria de dividir suas férias em dois períodos? (S ou N)");
						opcao = sc.next().charAt(0);

						if (opcao == 's' || opcao == 'S') {
							System.out.print("Digite a quantidade de dias que o primeiro período de férias terá: ");

							ferias = ferias - feriasVendidas;
							
						}
					}
				}
			}

		} else {
			System.out.println("Quanto tempo de trabalho o usuário possui desde o vencimento das últimas férias?");
		}
	}
}
