	import java.util.Scanner;

	public class swiex8 {

		public static void main(String[] args) {
		
			String pass;
		
	System.out.println("Password: ");
	
		Scanner leitor = new Scanner(System.in);
		
			pass = leitor.next();
			
		if (pass.equals("AEDB"))
			
	{System.out.println("Acesso permitido");}
		else
			
	{System.out.println("Acesso Negado");}
		
		

	}

}