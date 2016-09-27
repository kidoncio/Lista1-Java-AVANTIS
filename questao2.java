/* Pedra, papel e tesoura, também chamado de Janken-pon é um jogo de mãos recreativo
 * e simples para duas ou mais pessoas, que não requer equipamentos nem habilidade.
 * O jogo é frequentemente empregado como método de seleção (como na escolha de
 * equipes para a prática desportiva, por exemplo), assim como lançar moedas,
 * jogar dados, entre outros. No jogo, os jogadores devem simultaneamente esticar
 * a mão, na qual cada um formou um símbolo (que significa pedra, papel ou
 * tesoura). Então, os jogadores comparam os símbolos para decidir quem ganhou,
 * da seguinte forma: pedra ganha da tesoura (amassando-a ou quebrando-a);
 * tesoura ganha do papel (cortando-o); e, papel ganha da pedra (embrulhando-a).
 * A pedra é simbolizada por um punho fechado; a tesoura, por dois dedos esticados;
 * e o papel, pela mão aberta. Caso dois jogadores façam o mesmo gesto, ocorre um
 * empate, e geralmente se joga de novo até desempatar. Sabendo disso, pede-se que
 * se implemente o programa “AppJankenPon”, observandoas regras anteriormente
 * descritas.
 */

package lista1;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {

		int pedra = 1, papel = 2, tesoura = 3, jogador1 = 0, jogador2 = 0, vencedor = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao Janken-pon!\n");
		System.out.println("O jogo terá os seguintes valores: ");
		System.out.println("Pedra: 1");
		System.out.println("Papel: 2");
		System.out.println("Tesoura: 3\n");

		do {
			System.out.print("Jogador 1, escolha a sua opção: ");
			jogador1 = sc.nextInt();

			System.out.print("Jogador 2, escolha a sua opção: ");
			jogador2 = sc.nextInt();

			if (jogador1 == 1 && jogador2 == 1) {
				System.out.println("Empate! Joguem novamente! \n");
				vencedor = 0;
			}
			if (jogador1 == 1 && jogador2 == 2) {
				System.out.println("O Jogador2 venceu!\n");
				vencedor = 1;
			}
			if (jogador1 == 1 && jogador2 == 3) {
				System.out.println("O Jogador1 venceu!\n");
				vencedor = 1;
			}
			if (jogador1 == 2 && jogador2 == 1) {
				System.out.println("O Jogador1 venceu!\n");
				vencedor = 1;
			}
			if (jogador1 == 2 && jogador2 == 2) {
				System.out.println("Empate! Joguem novamente! \n");
				vencedor = 0;
			}
			if (jogador1 == 2 && jogador2 == 3) {
				System.out.println("O Jogador2 venceu! \n");
				vencedor = 1;
			}
			if (jogador1 == 3 && jogador2 == 1) {
				System.out.println("O Jogador2 venceu! \n");
				vencedor = 1;
			}
			if (jogador1 == 3 && jogador2 == 2) {
				System.out.println("O Jogador1 venceu! \n");
				vencedor = 1;
			}
			if (jogador1 == 3 && jogador2 == 3) {
				System.out.println("Empate! Joguem novamente! \n");
				vencedor = 0;
			}
		} while (vencedor != 1);

	}
}
