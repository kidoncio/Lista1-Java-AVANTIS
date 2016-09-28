import java.util.Scanner;

public class PositivoNegativoZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("entre com numero inteiro");
		numero=sc.nextInt();
		if(numero>0)
		{
			System.out.println("numero e positivo "+ " " + numero);
		}
		if(numero<0)
		{
			System.out.println("numero e negativo "+" "+ numero);
		}
		if(numero==0)
		{
			System.out.println("numero igual a zero"+ " "+ numero);
		}
	}

}
