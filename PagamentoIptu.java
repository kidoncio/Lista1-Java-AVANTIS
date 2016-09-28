import java.util.Scanner;
public class PagamentoIptu {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System .in);
		double valorVenal, aliquota=1.4,iPTU,iPTU10,valor,valor2,valor3,valor4,anoPassado;
		System.out.println("entre com o valor venal de seu imovel ");
		valorVenal=sc.nextDouble();
		iPTU=(valorVenal*aliquota)/100;
		valor=iPTU*20/100;
		valor=iPTU-valor;
		valor2=iPTU*10/100;
		valor2=iPTU-valor2;
		System.out.println("valor para pagar no vencimento com 20% em cota única " + valor);
		System.out.println("valor para pagar ate dois dias apos vencimento com 10% em cota única" + valor2);
		System.out.println("a contribuição do ano passado esta em dia ? 1 para sim 2 para nao  ");
		anoPassado=sc.nextDouble();
		if(anoPassado==1){
			valor3=iPTU*15/100;
			System.out.println("valor com 15% de desconto para contribuente em dia " + valor3);
		}else{
			System.out.println("valor para contribuente que nao estao em dia em relação ao ano passado " + iPTU);
		}
		valor4=iPTU/12;
		System.out.println("valor das parcelas em 12x  " + valor4);
	}

}
