		import java.util.Scanner;

		public class repex4
		{

				public static void main(String[] args) {
		
	
		
		int tr, rt=1, maior=0;
		
		
	
		do {
		System.out.println("Digite o " +rt+ "n�mero:");
		Scanner leitor = new Scanner(System.in);
		tr = leitor.nextInt();
			rt++;
		
		if (tr>maior)
		{maior=tr;}
		}
		while (rt<=15);
		
		System.out.println("Maior da sequ�ncia: "+maior);
	

	}

}