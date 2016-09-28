import java.util.Scanner;
public class ImparPar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero;
		System.out.println("entre com um numero inteiro");
		numero=sc.nextInt();
		if(numero%2==0){
			System.out.println("seu numero é par");
		}else
		{
		System.out.println("seu numero é impar");	
		}

	}

}
