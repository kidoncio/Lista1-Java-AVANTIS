import java.util.Scanner;

public class JogoDaVelha {

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
