import java.util.Scanner;

public class TrianguloEquilatero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int area,base,altura;
		System.out.println("entre com a base");
		base=sc.nextInt();
		System.out.println("entre com a altura do triangulo");
		altura=sc.nextInt();
		area=(base*altura)/2;
		System.out.println("a area do triangulo é de " + "  " + area);
	}

}
