	import java.util.Scanner;

	public class swiex10 {

		public static void main(String[] args) {
		
			
			
			float  alt, pid;
			
			String sx;
		
		
		Scanner leitor = new Scanner(System.in);
		
		
	System.out.println("Altura em metros: ");
		
		alt = leitor.nextFloat();
		

	System.out.println("Digite seu sexo: ");
		
		sx = leitor.next();
			
		if (sx.equals("masculino"))
		{
			
			pid = (float) (((72.7)*alt)-58);
	System.out.println("Peso ideal: " + pid);}
		
		
		
		else 
			
		
			if (sx.contentEquals("feminino"))
		{
				pid = (float) (((62.1)*alt)-44.7);
		
		
		
	System.out.println("Peso ideal: " + pid);}
		else;
		

	}

}