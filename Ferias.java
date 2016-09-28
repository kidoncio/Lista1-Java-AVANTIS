import java.util.Scanner;
public class Ferias {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float ferias=30,feriasVencidas,periodo1=0,periodo2=0,abono=0,dias=0;
		 int  teste=0;
		
			/* confere se o funcionario possui ferias vencidas ou nao**/
			System.out.println("o funcionario possui ferias vencidas ? 1 para sim 2 para nao ");
			teste=sc.nextInt();
			if(teste==1){
				System.out.println("digite a quantidade de ferias que o funcionario possui vencidas ex.: 2 ou 3");
				feriasVencidas=sc.nextFloat();
				ferias=ferias+feriasVencidas*30;
			}
			/*confere se o funcionario ira dividir em dois periodos suas ferias**/
			System.out.println("o funcionario ira dividir em dois periodos? 1 para sim e 2 para nao");
			teste=sc.nextInt();
			if(teste==1){
				System.out.println("quantos dias o funcionario ira pegar primeiro ?");
				periodo1=sc.nextFloat();
				System.out.println("quantos dias o funcionario ira pegar depois ");
				periodo2=sc.nextFloat();
				while(periodo1<10 || periodo2<10){
				System.out.println("PERIODO MINIMO 10 DIAS DIGITE NOVAMENTE! ");
				System.out.println("quantos dias o funcionario ira pegar primeiro ?");
				periodo1=sc.nextFloat();
				System.out.println("quantos dias o funcionario ira pegar depois ");
				periodo2=sc.nextFloat();
				}
			}
			
			/*confere se o funcionario ira vender parte das ferias**/ 
			System.out.println("o funcionario ira vender uma periodo de no maximo 10 dias? 1 para sim 2 para nao");
			teste=sc.nextInt();
			
			if(teste==1){
				System.out.println("quantos dias o funcionario ira vender ?");
				dias=sc.nextFloat();
				
				while(dias>10){
					System.out.println("o periodo de venda excedeu o permitido pela CLT digite novamente!");
					dias=sc.nextFloat();
				}
				ferias=ferias-dias;
			}
			
			/* calcula o salario do usuario referente as ferias**/
			float salario;
			
			System.out.println("digite o seu salario ");
			salario=sc.nextFloat();
			
			System.out.println(" entre com tempo de trabalho em meses desde o vencimento das ultimas ferias ");
			int tempoTrabalho=sc.nextInt();
			
			if(tempoTrabalho==12 || tempoTrabalho>12){
				abono=salario/3;
				salario=salario+abono;
			}else{
				float proporcional;
				salario=proporcional=salario/12;
			}
			
			/* se o usuario vendeu uma quantia de dias**/
			if(dias<=10){
				float diasVendidos=dias*(salario/30);
				salario=salario+diasVendidos;
			}
			
			/*imprime o valor de salario e ferias totais do funcionario**/
			System.out.println(" seu funcionario tem direito a " + " "+ ferias +" "+"dias"+ " "+ "e recebera "+ " "+salario);
			if(periodo1>0 || periodo2>0){
				System.out.println("sendo que primeiro ira retirar "+ " "+periodo1+ " " + "dias"+ " e depois mais "+periodo2 );
			}
		}
	}