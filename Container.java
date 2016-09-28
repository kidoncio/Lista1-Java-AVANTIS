import java.util.Scanner;

public class Container {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pallets,alturaPallets,larguraPallets,comprimentoPallets,containerDry20=(2.591*2.438*6.058)*300,containerDry40=(12.035*2.350*2690)*300,quantPallet;
		int teste=0;
		
		System.out.println("voce possui a aera total dos pallets utilizados? 1 para sim 2 para nao");
		teste=sc.nextInt();
		
		if(teste==1){
			System.out.println("qual o tamanho do seu pallet?");
			pallets=sc.nextDouble();
		}
		else
		{
			System.out.println("entre com a altura do pallet");
			alturaPallets=sc.nextDouble();
			System.out.println("entre com a largura do pallet");
			larguraPallets=sc.nextDouble();
			System.out.println("entre com o comprimento do pallet");
			comprimentoPallets=sc.nextDouble();
			pallets=(alturaPallets*larguraPallets*comprimentoPallets)*300;
		}
		System.out.println("quantos pallets voce pretende colocar?");
		quantPallet=sc.nextDouble();
		pallets=pallets*quantPallet;
		
		if(pallets<=containerDry20){
			System.out.println("a quantia pode ser carregada no container Dry 20 pés");
		}
		if(pallets<=containerDry40){
			System.out.println("a quantia pode ser carregada no container Dry 40 pés");
		}
	}
}
