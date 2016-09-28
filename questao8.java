package lista1;

/* O transporte internacional de longo percurso está sendo utilizado com frequência, devido ao
aumento das exportações. Ele pode tanto ser por meio rodoviário, como por marítimo,
ferroviário ou aéreo. As exportações para outros continentes, na sua maioria são feitas por
meio marítimo, pois é mais cômodo, seguro e viável, tanto para quem importa como para
quem exporta. Esse modal permite
ainda que, a mercadoria seja levada
em container, fazendo com que a
carga do navio tenha um maior
aproveitamento e a mercadoria viaje
com maior segurança. O container
nada mais é que uma caixa inviolável,
podendo ser fabricado em madeira,
alumínio e aço. Para a exportação pelos portos da Região Sul do Brasil, é mais comum utilizar
o de aço, já que nessa região a maresia é um dos itens que deve ser levado em conta e o aço
torna-se resistente sem ser muito oneroso como o alumínio e sem se decompor facilmente
como o container de madeira. Os contêineres têm suas medidas em “pés” ou “polegadas”,
sendo padronizados nas medidas de 20’ e 40’. Na atualidade, além das medidas inglesas, os
contêineres já são identificados pelo sistema métrico-decimal, apresentando as duas
classificações para facilitar o transporte. Devido a essa padronização, eles são muito
utilizados, pois conseguem promover maior agilidade na ova e desova da mercadoria, maior
segurança para a carga e mais praticidade no transporte.O termo “ova” de container significa o procedimento de carregar, de encher o
container com carga, e o termo “desova” significa proceder a descarga, a retirada da
mercadoria transportada. Uma terminologia também muito utilizada no transporte
internacional, que pode aparecer como sinônimo para ova é “estufar”, que possui o mesmo
significado.
Atualmente a unitização das cargas tem sido utilizada para agrupar vários volumes em
um volume único, em cima de pallets e envolto com filme chamado stretch, com o intuito de
proporcionar maior agilidade e segurança na carga e descarga. O stretch é um filme plástico,
comercializado em grandes rolos, que envolve as cargas com o intuito inicial de unitizá-las.
Como acessório, o stretch impermeabiliza a carga, e garante uma maior segurança, pois torna-
se mais uma embalagem secundária a ser colocada na carga, diminuindo a chance de roubo
de unidades transportadas. A utilização de pallets está crescendo porque facilita a ova e desova
do contêiner. Isso evita um custo oneroso devido à demora na manipulação de cargas soltas e
o risco de extravio de volumes.
A ocupação dos contêineres no caso de carga unitizadas, deve ocorrer pelo espaço
cúbico, levando em consideração as dimensões das cargas. Contêineres de 20’ são mais
indicados para cargas mais pesadas, pois tem um volume cúbico menor e uma pesagem maior.

Informações do container dry de 20 pés standard:
•Comprimento do container dry de 20 pés standard: 6.058 m
•Largura do container dry de 20 pés standard: 2.438 m
•Altura do container dry de 20 pés standard: 2.591 m
•Capacidade de carga útil do container dry de 20 pés standard: 21,780 kg
•Tara aproximada do container dry de 20 pés standard: 2,220 kg


Informações do container dry de 40 pés standard:
•Comprimento do container dry de 40 pés standard: 12.035 m
•Largura do container dry de 40 pés standard: 2.350 m
•Altura do container dry de 40 pés standard: 2.690 m
•Capacidade de carga útil do container dry de 40 pés standard: 28,800 kg
•Tara aproximada do container dry de 40 pés standard: 3,700 kg

Sabendo disso, implemente um programa que permita informar quantas caixas de um
determinado produto podem comportar dentro de cada tipo de container. Não esqueça de
considerar as informações fornecidas no texto deste exercício, e indicar o container mais
adequado para o produto informado.
*/

import java.util.Scanner;

public class questao8 {
	public static void main(String[] args) {

		System.out.println("Esse programa irá definir qual a melhor opção de container para a sua carga!");

		System.out.println(
				"Como padrão, nós possuímos os containers: dry de 20 pés stardard e dry de 40 pés stardard. \n\n");

		float comprimento = 0, largura = 0, altura = 0, metroCubicoProduto = 0, metroCubicoDry20 = 0,
				metroCubicoDry40 = 0, pesoProduto = 0;
		int capacidadeCargaDry20 = 0, capacidadeCargaDry40 = 0, capacidadePesoDry20 = 0, capacidadePesoDry40 = 0,
				pesoTotal20, pesoTotal40;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Precisamos saber as dimensões da caixa do seu produto para determinar qual a melhor opção para você.");
		System.out.print("Digite a altura do pallet do seu produto (em m): ");
		altura = sc.nextFloat();
		System.out.print("Digite a largura do pallet do seu produto (em m): ");
		largura = sc.nextFloat();
		System.out.print("Digite o comprimento do pallet do seu produto (em m): ");
		comprimento = sc.nextFloat();
		System.out.print("Digite o peso do pallet do seu produto (em kg): ");
		pesoProduto = sc.nextFloat();

		metroCubicoProduto = altura * comprimento * largura;

		// CALCULO DAS DIMENSÕES DRY 20 STANDARD
		comprimento = 0;
		largura = 0;
		altura = 0;
		comprimento = (float) 6.058;
		largura = (float) 2.438;
		altura = (float) 2.591;
		capacidadePesoDry20 = 21780;
		metroCubicoDry20 = (altura * comprimento * largura);

		// CALCULO DAS DIMENSÕES DRY 40 STANDARD
		comprimento = 0;
		largura = 0;
		altura = 0;
		comprimento = (float) 12.035;
		largura = (float) 2.350;
		altura = (float) 2.690;
		capacidadePesoDry40 = 28800;
		metroCubicoDry40 = (altura * comprimento * largura);

		if ((pesoProduto > capacidadePesoDry20) || (pesoProduto > capacidadePesoDry40)
				|| (metroCubicoProduto > metroCubicoDry20) || (metroCubicoProduto > metroCubicoDry40)) {
			System.out.println("\nAs dimensões do produto excedem as dimensões suportadas pelos containers.");
		}

		else {

			// CALCULO PARA SABER QUANTOS PRODUTOS CABEM NO CONTAINER
			capacidadeCargaDry20 = (int) (metroCubicoDry20 / metroCubicoProduto);
			capacidadeCargaDry40 = (int) (metroCubicoDry40 / metroCubicoProduto);

			pesoTotal20 = (int) (pesoProduto * capacidadeCargaDry20);
			pesoTotal40 = (int) (pesoProduto * capacidadeCargaDry40);

			if ((pesoTotal20 <= capacidadePesoDry20) || (pesoTotal40 <= capacidadePesoDry40)) {
				System.out.println("\nNo container Dry 20, é possível armazenar " + capacidadeCargaDry20 + " produtos");
				System.out.println("No container Dry 40, é possível armazenar " + capacidadeCargaDry40 + " produtos");
				System.out.println("\nPara o seu produto nós recomendamos a utilização do Container dry 40.");
				System.out.println(
						"Ao utilizar o Dry 40, o peso total dos seus produtos será de: " + pesoTotal40 + " kg.");
			}

			else if ((pesoTotal40 > capacidadePesoDry40) && (pesoTotal20 < capacidadePesoDry20)) {
				System.out.println(
						"\n\nDevido ao peso do seu produto, é mais recomendável que você utilize o container Dry 20 pés Standard.");
				System.out.println(
						"Ao utilizar o Dry 20, o peso total dos seus produtos será de: " + pesoTotal20 + " kg.");
			}
		}
	}

}
