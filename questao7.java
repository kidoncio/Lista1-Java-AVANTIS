/*De acordo com a Consolidação das Leis do Trabalho (CLT), quem possui carteira assinada
tem direito a 30 dias de férias depois de completar 12 meses na mesma organização. Caso a
folga não seja possível logo após esse período, a empresa deve liberar o funcionário para as
férias nos 11 meses seguintes ou terá de pagar a ele o dobro da remuneração. Em algumas
situações, as férias de 30 dias são divididas em dois períodos. Um deles não pode ser menor
que 10 dias sequenciais. A lei também permite ao empregado “vender” 10 dias das férias à
empresa e assim convertê-los em dinheiro. Além do salário base, é necessário saber quanto
tempo de trabalho o empregado possui desde o vencimento das últimas férias. Se esse período
for de 12 meses, ele receberá o valor integral das férias, acrescido de 1/3 de abono. Se inferior,
receberá proporcionalmente, ou seja, 1/12 por mês trabalhado.
Sabendo disso, faça um programa que calcule as férias de empregados, considere
também se o empregado vendeu algum dia de suas férias. Não esqueça que seu programa
deve de estar em conformidade com o CLT.
*/



import java.util.Scanner;

public class questao7 {
	public static void main(String[] args) {

		System.out.println("Bem vindo ao programa de cálculo de FÉRIAS! \n");

		System.out.println(
				"De acordo com a CLT, quem possui carteira assinada, 30 dias de férias depois de completar 12 meses na mesma organização\n\n");

		float tempoTrabalho = 0, vencimentoFerias = 0, feriasVendidas = 0, ferias = 30, periodoFerias = 0,
				abonoConstitucional = 0, abonoPecuniario = 0, valorFeriasVendidas = 0, total = 0;
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
			System.out.print("Digite quanto tempo o usuário possui de registro na mesma organização: ");
			tempoTrabalho = sc.nextInt();
		}

		// --------------------------- INICIO TEMPO DE TRABALHO < 12
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

						abonoConstitucional = salario / 3;
						abonoPecuniario = salario / 30;
						valorFeriasVendidas = feriasVendidas * abonoPecuniario;
						total = valorFeriasVendidas + salario + abonoConstitucional;

						System.out.println(
								"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
						System.out.println("O usuário decidiu vender " + feriasVendidas + " dias de suas férias.");
						System.out.println("Pela venda das férias, o usuário irá receber R$ " + valorFeriasVendidas);
						System.out.println(
								"Quando o usuário completar 12 meses registrado nessa organização, ele terá direito a "
										+ ferias + " dias de férias.");
						System.out
								.println("O  primeiro período de férias terá um total de: " + periodoFerias + " dias.");
						ferias = ferias - periodoFerias;
						System.out.println("O segundo período de férias terá um total de: " + ferias + " dias.");
						System.out.println("Ao todo, o usuário irá receber R$ " + total);
					}
				} else {
					System.out.println("Só é possível vender até no máximo 10 dias de suas férias.");
					System.out.println("Por favor, reinicie o programa com os valores corretos.");
				}
			}
			// CASO O USUÁRIO QUE POSSUA MENOS DO QUE 12 MESES DE TRABALHO NÃO
			// QUEIRA VENDER AS SUAS FÉRIAS.
			else {
				System.out.println("O usuário gostaria de dividir suas férias em dois períodos? (S ou N)");
				opcao = sc.next().charAt(0);

				if (opcao == 's' || opcao == 'S') {
					System.out.print("Digite a quantidade de dias que o primeiro período de férias terá: ");
					periodoFerias = sc.nextInt();

					ferias = ferias - periodoFerias;

					System.out.println("\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
					System.out.println("O usuário possui direito a " + ferias + " dias de férias.");
					System.out.println("O  primeiro período de férias terá um total de: " + periodoFerias + " dias.");

					System.out.println("O segundo período de férias terá um total de: " + ferias + " dias.");

				}
				// CASO O USUÁRIO QUE TENHA MENOS DE 12 MESES DE REGISTRO QUE
				// NÃO QUEIRA VENDER AS SUAS FÉRIAS,
				// TAMBÉM NÃO QUEIRA DIVIDIR AS FÉRIAS EM DOIS PERÍODOS.
				else {

					System.out.println("\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
					System.out.println(
							"Quando o usuário completar 12 meses registrado nessa organização, ele terá direito a "
									+ ferias + " dias de férias.");

				}
			}

		}
		// --------------------------- FIM TEMPO DE TRABALHO < 12

		// --------------------------- INICIO TEMPO DE TRABALHO >= 12
		if (tempoTrabalho >= 12) {
			System.out
					.print("Digite o tempo de trabalho que o empregado possui desde o vencimento das últimas férias: ");
			vencimentoFerias = sc.nextInt();

			// CASO O EMPREGADO POSSUA MAIS DE 12 MESES DESDE O VENCIMENTO DAS
			// ÚLTIMAS FÉRIAS.
			if (vencimentoFerias >= 12) {
				System.out.println("O usuário gostaria de vender parte de suas férias? (S ou N)");
				opcao = sc.next().charAt(0);

				if (opcao == 's' || opcao == 'S') {
					System.out.println("Quantos dias de suas férias o usuário quer vender?");
					feriasVendidas = sc.nextInt();

					abonoConstitucional = salario / 3;
					abonoPecuniario = salario / 30;
					valorFeriasVendidas = feriasVendidas * abonoPecuniario;
					total = valorFeriasVendidas + salario + abonoConstitucional;

					if (feriasVendidas <= 10) {
						System.out.println("O usuário gostaria de dividir suas férias em dois períodos? (S ou N)");
						opcao = sc.next().charAt(0);

						if (opcao == 's' || opcao == 'S') {
							System.out.print("Digite a quantidade de dias que o primeiro período de férias terá: ");
							periodoFerias = sc.nextInt();

							ferias = ferias - feriasVendidas;

							System.out.println(
									"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
							System.out.println("O usuário decidiu vender " + feriasVendidas + " dias de suas férias.");
							System.out
									.println("Pela venda das férias, o usuário irá receber R$ " + valorFeriasVendidas);
							System.out.println("O usuário possui direito a " + ferias + " dias de férias.");
							System.out.println(
									"O  primeiro período de férias terá um total de: " + periodoFerias + " dias.");
							ferias = ferias - periodoFerias;
							System.out.println("O segundo período de férias terá um total de: " + ferias + " dias.");
							System.out.println("Ao todo, o usuário irá receber R$ " + total);
						}
					} else {
						System.out.println("Só é possível vender até no máximo 10 dias de suas férias.");
						System.out.println("Por favor, reinicie o programa com os valores corretos.");
					}
				}

				// CASO O USUÁRIO QUE POSSUI 12 MESES DESDE O VENCIMENTO DAS
				// ÚLTIMAS FÉRIAS NÃO QUEIRA VENDER AS SUAS FÉRIAS.
				else {
					abonoConstitucional = salario / 3;
					total = abonoConstitucional + salario;

					System.out.println("O usuário gostaria de dividir suas férias em dois períodos? (S ou N)");
					opcao = sc.next().charAt(0);

					if (opcao == 's' || opcao == 'S') {
						System.out.print("Digite a quantidade de dias que o primeiro período de férias terá: ");
						periodoFerias = sc.nextInt();

						ferias = ferias - periodoFerias;

						System.out.println(
								"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
						System.out.println("O usuário possui direito a " + ferias + " dias de férias.");
						System.out
								.println("O  primeiro período de férias terá um total de: " + periodoFerias + " dias.");

						System.out.println("O segundo período de férias terá um total de: " + ferias + " dias.");
						System.out.println("Ao todo, o usuário irá receber R$ " + total);

					}
					// CASO O USUÁRIO QUE POSSUI 12 MESES DESDE O VENCIMENTO DAS
					// ÚLTIMAS FÉRIAS NÃO QUEIRA VENDER AS SUAS FÉRIAS,
					// TAMBÉM NÃO QUEIRA DIVIDIR AS FÉRIAS EM DOIS PERÍODOS.
					else {

						System.out.println(
								"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
						System.out.println("O usuário possui direito a " + ferias + " dias de férias.");
						System.out.println("Ao todo, o usuário irá receber R$ " + total);

					}
				}

			}
			// CASO O USUÁRIO TENHA MENOS DE 12 MESES DESDE O VENCIMENTO DAS
			// ÚLTIMAS FÉRIAS
			else {
				System.out.println("Quanto tempo de trabalho o usuário possui desde o vencimento das últimas férias?");
				vencimentoFerias = sc.nextFloat();

				System.out.println("O usuário gostaria de vender parte de suas férias? (S ou N)");
				opcao = sc.next().charAt(0);

				if (opcao == 's' || opcao == 'S') {
					System.out.println("Quantos dias de suas férias o usuário quer vender?");
					feriasVendidas = sc.nextInt();

					abonoPecuniario = salario / 30;
					abonoConstitucional = abonoPecuniario * vencimentoFerias;
					valorFeriasVendidas = feriasVendidas * abonoPecuniario;
					total = valorFeriasVendidas + salario + abonoConstitucional;

					if (feriasVendidas <= 10) {
						System.out.println("O usuário gostaria de dividir suas férias em dois períodos? (S ou N)");
						opcao = sc.next().charAt(0);

						if (opcao == 's' || opcao == 'S') {
							System.out.print("Digite a quantidade de dias que o primeiro período de férias terá: ");
							periodoFerias = sc.nextInt();

							ferias = ferias - feriasVendidas;

							System.out.println(
									"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
							System.out.println("O usuário decidiu vender " + feriasVendidas + " dias de suas férias.");
							System.out
									.println("Pela venda das férias, o usuário irá receber R$ " + valorFeriasVendidas);
							System.out.println("O usuário possui direito a " + ferias + " dias de férias.");
							System.out.println(
									"O  primeiro período de férias terá um total de: " + periodoFerias + " dias.");
							ferias = ferias - periodoFerias;
							System.out.println("O segundo período de férias terá um total de: " + ferias + " dias.");
							System.out.println("Ao todo, o usuário irá receber R$ " + total);
						}
					} else {
						System.out.println("Só é possível vender até no máximo 10 dias de suas férias.");
						System.out.println("Por favor, reinicie o programa com os valores corretos.");
					}
				}

				// CASO O USUÁRIO QUE TENHA MENOS DE 12 MESES DESDE O VENCIMENTO
				// DAS ÚLTIMAS FÉRIAS NÃO QUEIRA VENDER AS SUAS FÉRIAS.
				else {
					abonoPecuniario = salario / 30;
					abonoConstitucional = abonoPecuniario * vencimentoFerias;
					total = abonoConstitucional + salario;

					System.out.println("O usuário gostaria de dividir suas férias em dois períodos? (S ou N)");
					opcao = sc.next().charAt(0);

					if (opcao == 's' || opcao == 'S') {
						System.out.print("Digite a quantidade de dias que o primeiro período de férias terá: ");
						periodoFerias = sc.nextInt();

						ferias = ferias - periodoFerias;

						System.out.println(
								"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
						System.out.println("O usuário possui direito a " + ferias + " dias de férias.");
						System.out
								.println("O  primeiro período de férias terá um total de: " + periodoFerias + " dias.");

						System.out.println("O segundo período de férias terá um total de: " + ferias + " dias.");
						System.out.println("Ao todo, o usuário irá receber R$ " + total);

					}
					// CASO O USUÁRIO QUE TENHA MENOS DE 12 MESES DESDE O
					// VENCIMENTO DAS ÚLTIMAS FÉRIAS NÃO QUEIRA VENDER AS SUAS
					// FÉRIAS,
					// TAMBÉM NÃO QUEIRA DIVIDIR AS FÉRIAS EM DOIS PERÍODOS.
					else {

						System.out.println(
								"\nO usuário possui " + tempoTrabalho + " meses registrado nessa organização.");
						System.out.println("O usuário possui direito a " + ferias + " dias de férias.");
						System.out.println("Ao todo, o usuário irá receber R$ " + total);

					}
				}
			}
		}
		// --------------------------- FIM TEMPO DE TRABALHO >= 12

	}
}
