/* O jogo da velha é um jogo e passatempo popular. É um jogo de regras extremamente simples,
que não traz grandes dificuldades para seus jogadores e é facilmente aprendido. Seu nome
teria se originado na Inglaterra, quando nos finais da tarde, mulheres se reuniram para
conversar e bordar. As mulheres idosas, por não terem mais condições de bordar em razão da fraqueza da visão,
jogavam este jogo simples, que passou a ser conhecido como o da “velha”. O jogo consiste de um tabuleiro de
três linhas por três colunas, onde dois jogadores escolhem uma marcação cada um, geralmente um círculo
(O) e um xis (X). Os jogadores jogam com as mãos uma marcação por vez em uma lacuna que esteja vazia no tabuleiro. O objetivo é conseguir 3
círculos ou três xis em linha horizontal, vertical ou diagonal , e ao mesmo tempo, quando
possível, impedir o adversário de ganhar na próxima jogada. Quando um jogador conquista o
objetivo, costuma-se riscar os três símbolos. Quando um dos jogadores vence, o mesmo
começa a outra partida. Agora, sabendo das regras do jogo implemente a estrutura de ifs
aninhados para verificar quem é o ganhador (não é necessário a implementação o jogo inteiro)
a partir do código descrito na Tabela 1. Vale lembrar que a verificação do ganhador pode ser
feita pela expressão tabuleiro[nLinha][nColuna] == jogador .
Tabela 1- Código fonte inicial para o jogo da velha
public class AppTicTacToe {
public static void main(String[] args) {
char jogador1 = 'X';
char jogador2 = '0';
char[][] tabuleiro = new char[3][3];
tabuleiro[0][0] = 'X';
tabuleiro[0][1] = '0';
tabuleiro[0][1] = 'X';
tabuleiro[1][0] = '0';
tabuleiro[1][1] = '0';
tabuleiro[1][2] = 'X';
tabuleiro[2][0] = 'X';
tabuleiro[2][1] = '0';
tabuleiro[2][2] = 'X';
}
}
*/

package lista1;

public class questao3 {

	public static void main(String[] args) {
		char jogador1='X', jogador2='O';
		char [][] tabuleiro = new char [3][3];
		tabuleiro[0][0]='X';
		tabuleiro[0][1]='O';
		tabuleiro[0][1]='X';
		tabuleiro[1][0]='O';
		tabuleiro[1][1]='O';
		tabuleiro[1][2]='X';
		tabuleiro[2][0]='X';
		tabuleiro[2][1]='O';
		tabuleiro[2][2]='X';
		
		
			//*teste para ver quem ganhou quem perdeu;*/
				if(tabuleiro[0][0]=='X'&& tabuleiro[0][1]=='X'&& tabuleiro[0][2]=='X'){
				System.out.println("voce ganhou jogador 1 ");
				}
				if(tabuleiro[0][0]=='O'&& tabuleiro[0][1]=='O'&& tabuleiro[0][2]=='O'){
					System.out.println("voce ganhou jogador 2 ");
				}
				if(tabuleiro[1][0]=='X'&& tabuleiro[1][1]=='X'&& tabuleiro[1][2]=='X'){
					System.out.println("voce ganhou jogador 1 ");
				}
				if(tabuleiro[1][0]=='O'&& tabuleiro[1][1]=='O'&& tabuleiro[1][2]=='O'){
					System.out.println("voce ganhou jogador 2 ");
				}
				if(tabuleiro[2][0]=='X'&& tabuleiro[2][1]=='X'&& tabuleiro[2][2]=='X'){
					System.out.println("voce ganhou jogador 1 ");
				}
				if(tabuleiro[2][0]=='O'&& tabuleiro[2][1]=='O'&& tabuleiro[2][2]=='O'){
					System.out.println("voce ganhou jogador 2 ");
				}
			//*teste para ver quem ganhou na coluna principal*/
				if(tabuleiro[0][0]=='X' && tabuleiro[1][1]=='X' && tabuleiro[2][2]=='X'){
					System.out.println("voce ganhou jogador 1");
				}
				if(tabuleiro[0][0]=='O' && tabuleiro[1][1]=='O' && tabuleiro[2][2]=='O'){
					System.out.println("voce ganhou jogador 2");
				}
			//*teste para ver quem ganhou na coluna secundaria*/
				if(tabuleiro[2][0]=='X' && tabuleiro[1][1]=='X' && tabuleiro[0][2]=='X'){
					System.out.println("voce ganhou jogador 1");
				}
				if(tabuleiro[2][0]=='O' && tabuleiro[1][1]=='O' && tabuleiro[0][2]=='O'){
					System.out.println("voce ganhou jogador 2");
				}
			//* teste para ver ganhou nas colunas*/
				if(tabuleiro[0][0]=='X'&& tabuleiro[1][0]=='X'&& tabuleiro[2][0]=='X'){
					System.out.println("voce ganhou jogador 1 ");
				}
				if(tabuleiro[0][0]=='O'&& tabuleiro[1][0]=='O'&& tabuleiro[2][0]=='O'){
					System.out.println("voce ganhou jogador 2 ");
				}
				if(tabuleiro[0][1]=='X'&& tabuleiro[1][1]=='X'&& tabuleiro[2][1]=='X'){
					System.out.println("voce ganhou jogador 1 ");
				}
				if(tabuleiro[0][1]=='O'&& tabuleiro[1][1]=='O'&& tabuleiro[2][1]=='O'){
					System.out.println("voce ganhou jogador 2 ");
				}
				if(tabuleiro[0][2]=='X'&& tabuleiro[1][2]=='X'&& tabuleiro[2][2]=='X'){
					System.out.println("voce ganhou jogador 1 ");
				}
				if(tabuleiro[0][2]=='O'&& tabuleiro[1][2]=='O'&& tabuleiro[2][2]=='O'){
					System.out.println("voce ganhou jogador 2 ");
				}
				else
				{
					System.out.println("EMPATE");
				}
				
			}
}
