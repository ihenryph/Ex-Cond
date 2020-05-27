			import java.util.Scanner;

				public class condex3 {

				public static void main(String[] args) {
		
				float cl;
		
		
		
		System.out.println("Salário atual: ");
			Scanner leitor = new Scanner(System.in);
			cl = leitor.nextFloat();
		
		if ((cl>0)&&(cl<=1000))
		
		{System.out.println("15% de aumento.");
		 
		System.out.println("Novo salário"+ 1.15*cl);
		}
		
		else if ((cl>=1000)&&(cl<=2500))
		
		{System.out.println("7% de aumento.");
		
		System.out.println("Novo salário"+ 1.07*cl);}
		
		else if (cl>2500)
		
		{System.out.println("Zero aumento");}
		
		else
		
		{System.out.println("Valor errado.");}
		
		
		

	}

}