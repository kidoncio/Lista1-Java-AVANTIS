import java.util.Scanner;

public class Ferias {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ferias=30,teste=0,dias,feriasVencidas,meses=12,periodo1=0,periodo2=0;
			System.out.println("o funcionario possui ferias vencidas ? 1 para sim 2 para nao ");
			teste=sc.nextInt();
			if(teste==1){
				System.out.println("digite a quantidade de ferias que o funcionario possui vencidas ex.: 2 ou 3");
				feriasVencidas=sc.nextInt();
				ferias=ferias+feriasVencidas*30;
			}
			System.out.println("o funcionario ira dividir em dois periodos? 1 para sim e 2 para nao");
			teste=sc.nextInt();
			if(teste==1){
				System.out.println("quantos dias o funcionario ira pegar primeiro ?");
				periodo1=sc.nextInt();
				System.out.println("quantos dias o funcionario ira pegar depois ");
				periodo2=sc.nextInt();
				if(periodo1<10 || periodo2<10){
					System.out.println("um dos periodos precisa ser no minimo de 10 dias programa corrigido!");
					ferias=ferias-10;
				}
			}
			System.out.println("o funcionario ira vender uma periodo de no maximo 10 dias? 1 para sim 2 para nao");
			teste=sc.nextInt();
			if(teste==1){
				System.out.println("quantos dias o funcionario ira vender ?");
				dias=sc.nextInt();
				ferias=ferias-dias;
			}
			System.out.println(" seu funcionario tem direito a " + " "+ ferias +" "+"dias");
			if(periodo1>0 || periodo2>0){
				System.out.println("sendo que primeiro ira retirar "+ " "+periodo1+ " " + "dias"+ " e depois mais "+periodo2 );
			}
		}
	}