		import java.util.Scanner;

			public class condex4 {

					public static void main(String[] args) {
	
		
						
						float pl, sl,tl;
		
		
				Scanner leitor = new Scanner(System.in);
		
				
				System.out.println("Comprimento primeiro lado: ");
				pl = leitor.nextFloat();
		
				System.out.println("Comprimento segundo lado: ");
				sl = leitor.nextFloat();
		
				System.out.println("Comprimento terceiro lado: ");
				tl = leitor.nextFloat();
		
				if ((pl<sl+tl)&&(sl<pl+tl)&&(tl<pl+sl))
				{
		
				if ((pl==sl)&&(pl==tl)&&(sl==tl))
		
			{System.out.println("triangulo equilatero.");
			}
				else
			
			if ((pl==sl)||(pl==tl)||(sl==tl))
			{System.out.println("triangulo isosceles.");
			}
		
			else
		{System.out.println("tringulo escaleno.");}
		}
		else
		{System.out.println("Diferente de triangulo.");}
		
		

	}

}