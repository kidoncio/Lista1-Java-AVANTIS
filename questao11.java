import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
  
		Scanner sc= new Scanner(System.in);
    
		int area, base, altura;
    
		System.out.print("Digite o valor da base: ");
		base = sc.nextInt();
    
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextInt();
    
		area = (base * altura) / 2;
    
    System.out.println("A área do triângulo é de "+ area);
	}

}
