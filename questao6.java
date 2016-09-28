/*
Anualmente, boa parte dos proprietários de imóveis de todas as regiões do Brasil têm que
encarar aquela que é uma das mais importantes taxas imobiliárias do país, o Imposto sobre a
Propriedade Predial e Territorial Urbana (IPTU). A contribuição é tão tradicional dentro da
rotina imobiliária do país que pouca gente sabe verificar se está pagando um imposto
compatível com as condições estruturais do
imóvel e da região em que ele está localizado.
Isso porque o tributo é definido com base no
valor venal do imóvel, calculado a partir da
Planta Genérica de Valores Imobiliários (PGVI)
do município. Este documento oficial cataloga o
preço médio do metro quadrado em cada via da
cidade. Assim, para descobrir quanto você vai pagar de IPTU, basta aplicar ao valor venal da
sua propriedade as alíquotas determinadas pela legislação municipal. Boa parte dos
municípios adota o cálculo progressivo do imposto. “A alíquota é definida pelo valor do
imóvel. Quando menor o valor, menor a alíquota”, afirma Nelson Lacerda, advogado
tributário do escritório Lacerda & Lacerda. Por exemplo, o proprietário de um imóvel avaliado
em 500.000 reais que fica em um município cuja alíquota, para esta faixa de preço, é de 1,4%,
irá pagar 7.000 reais de imposto (Fonte: Exame.com - Como é feito o cálculo do IPTU, 2010).
Sabendo disso, faça um programa que permita imprimir o valor do IPTU a pagar a
partir do valor venal. Considere também um desconto de 20% para pagamentos em conta
única até a data de hoje, e de 10% para pagamentos até dois dias após a data de hoje, também
em conta única. O programa deve dar um desconto de 15% para os contribuintes que tiverem
o pagamento do IPTU do ano passo em dia, indiferente de pagamento a vista, ou parcelado.
O programa também deve apresentar o valor para o pagamento parcelado em 12X.
*/

import java.util.Scanner;
public class questao6 {

	public static void main(String[] args) {
  
		Scanner sc =new Scanner (System .in);
    
		double valorVenal, aliquota=1.4,iPTU,iPTU10,valor,valor2,valor3,valor4,anoPassado;
    
		System.out.print("Digite o valor venal do seu imóvel: ");
		valorVenal=sc.nextDouble();
    
		iPTU=(valorVenal*aliquota)/100;
		valor=iPTU*20/100;
		valor=iPTU-valor;
		valor2=iPTU*10/100;
		valor2=iPTU-valor2;
    
		System.out.println("Valor para pagar no vencimento, com 20% em cota única: "+ valor);
		System.out.println("Valor para pagar até dois dias após vencimento, com 10% em cota única: "+ valor2);
    
		System.out.println("A contribuição do ano passado esta em dia? ( 1 = Sim / 2 = Não )");
		anoPassado=sc.nextDouble();
    
		if(anoPassado==1){
			valor3=iPTU*15/100;
			System.out.println("Valor com 15% de desconto para contribuente em dia: " + valor3);
		}else{
			System.out.println("Valor para contribuente que não estão em dia em relação ao ano passado: " + iPTU);
		}
		valor4=iPTU/12;
		System.out.println("Valor das parcelas em 12x: " + valor4);
	}

}
