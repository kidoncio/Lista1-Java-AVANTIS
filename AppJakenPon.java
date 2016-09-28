import java.util.Scanner;

public class AppJakenPon {
	
	public static void main(String[]args){
		
		int pedra=1, papel=2, tesoura=3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome jogador 1");
		String jogador1 = sc.nextLine();
		System.out.println("Agora digite o seu nome jogador2");
		String jogador2  = sc.nextLine();
		
		int escolha1;

		System.out.println("jogador 1 escolha uma opção:");
		System.out.println("1=pedra");
		System.out.println("2=papel");
		System.out.println("3=tesoura");
		escolha1 = sc.nextInt();
		
		
		int escolha2;
		System.out.println("jogador 2 sua vez de escolher uma opção");
		System.out.println("1=pedra");
		System.out.println("2=papel");
		System.out.println("3=tesoura");
		escolha2 = sc.nextInt();

		
		if(escolha1==papel && escolha2==pedra){
			System.out.printf("voce ganhou " + jogador1);
		}
		if(escolha2==papel && escolha1==pedra){
			System.out.printf("voce ganhou " + jogador2);
		}
		if(escolha1==tesoura && escolha2==papel){
			System.out.println("voce ganhou " + jogador1);
		}
		if(escolha2==tesoura && escolha1==papel){
			System.out.println("voce ganhou " + jogador2);
		}
		if(escolha1==pedra && escolha2==tesoura){
			System.out.println("voce ganhou " + jogador1);
		}
		if(escolha2==pedra && escolha1==tesoura){
			System.out.println("voce ganhou " + jogador2);
		}
	}
}
