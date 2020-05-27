		import java.util.Scanner;

		public class swiex6 {

			public static void main(String[] args) {
				
				
				
				
		float nt1, nt2, nt3, md;
		
	System.out.println("Primeira nota: ");
		Scanner leitor = new Scanner(System.in);
		
			nt1 = leitor.nextFloat();
		
	System.out.println("Digite a segunda nota: ");
	
		nt2 = leitor.nextFloat();
		
		
	System.out.println("Digite a terceira nota: ");
	
		nt3 = leitor.nextFloat();
		
		md=(((2*nt1)+(3*nt2)+(5*nt3))/10);
		
		
		if (md>=7.0)
	{System.out.println("Aprovado");
	
		}
		else 
	{System.out.println("Reprovado");
	
		}
	
		

	}

}