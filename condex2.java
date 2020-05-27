			import java.util.Scanner;

				public class condex2 {

					public static void main(String[] args) {
		
						
						
		int pol;
		
	
		System.out.println("Digite idade: ");
			Scanner leitor = new Scanner(System.in);
				
			pol = leitor.nextInt();
		
		if ((pol>=5)&&(pol<=10))
			
		
		{System.out.println("Infantil");
			}
				
		else if ((pol>=11)&&(pol<=17))
			
				
		{System.out.println("Juvenil.");
			}
		
		
		else if (pol>=18)
			
				
		{System.out.println("Adulto");
			}
		
		
		else
			{System.out.println("Idade Incorreta");				
			}
		
				

	}

}
