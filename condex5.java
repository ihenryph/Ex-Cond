	import java.util.Scanner;

		public class condex5 {

			public static void main(String[] args) {
	
		
		
		
		double md;
			float pn,sn,tn,qn;
		
		
		
	System.out.println("Primeira nota: ");
		Scanner leitor = new Scanner(System.in);
		pn = leitor.nextFloat();
	
	System.out.println("Segunda nota: ");
		sn = leitor.nextFloat();
	
	System.out.println("Terceira nota: ");
		tn = leitor.nextFloat();
	
	System.out.println("Quarta nota: ");
		qn = leitor.nextFloat();
			md=(pn+sn+tn+qn)/4;
		
			if (md>=7.0)
	{System.out.println("Aprovado.");
		}
			else
		if ((md>=3.5)&&(md<7.0))
	{System.out.println("Recuperação.");
		 }
		else
			if (md<3.5)
	{System.out.println("Reprovado.");}
		else
	{System.out.println("Incorreto.");}
		
		
		

	}

}
