import java.util.Scanner;

public class MeteorologiaBc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean v=false,f=false,u=false,n=false;
		int teste;
		System.out.println("digite 1 para verdadeiro e 0 para falso \n");
		System.out.println("Esta ventando ?");
		teste=sc.nextInt();
		if(teste==1){
			v=true;
		}else if(teste==0){
			v=false;
		}
		System.out.println("Esta frio ?");
		teste=sc.nextInt();
		if(teste==1){
			f=true;
		}else if(teste==0){
			f=false;
		}		
		System.out.println("Esta umido ?");
		teste=sc.nextInt();
		if(teste==1){
			u=true;
		}else if(teste==0){
			u=false;
		}		
		System.out.println("Esta nublado?");
		teste=sc.nextInt();
		if(teste==1){
			n=true;
		}else if(teste==0){
			n=false;
		}
		if(v==true && f==true && u==true && n==true){
			System.out.println("vai chover hoje em Balneario Camboriu");
		}else{
			System.out.println("nao ira chover em Balenario Camboriu");
		}
	}
}
