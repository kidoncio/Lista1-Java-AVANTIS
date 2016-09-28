import java.util.Scanner;

public class ValorDeVenda {

	public static void main(String[] args) {
		float produto,lucro,venda;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre com valor do produto");
		produto=sc.nextFloat();
		System.out.println("qual margem por cento de lucro");
		lucro=(sc.nextFloat()*produto)/100;
		venda=produto+lucro;
		System.out.println("valor de venda= "+ venda + "  seu lucro foi de " + lucro + "  valor unitario do produto= " + produto);
	}

}
