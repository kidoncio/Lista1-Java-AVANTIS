import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float media,nota1,nota2,nota3;
		System.out.println("entre com suas notas ");
		nota1=sc.nextFloat();
		nota2=sc.nextFloat();
		nota3=sc.nextFloat();
		media=(2*nota1+3*nota2+5*nota3)/(2+3+5);
		System.out.println("sua media é "+ " "+ media);
		
	}

}
