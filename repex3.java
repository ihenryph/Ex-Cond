	import java.util.Scanner;

	public class repex3 {

		public static void main(String[] args) {
		
		
		double ln,
		sm=0,
		md=0;
		int cl=1;
		
	
	
		do
		{
	System.out.println("Digite um inteiro: ");
		Scanner leitor = new Scanner(System.in);
		
		ln = leitor.nextInt();
		
		sm+=ln;
		
		cl++;
		
		
		}
			while (cl<=20);
		
		md=sm/20;
	
		System.out.println("Soma dos números:"+sm);
		
	System.out.println("Média:"+md);

	}

}