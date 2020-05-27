	import java.util.Scanner;

	public class swiex9
	{

		public static void main(String[] args) {
		
			
			float vn, pr;
		
	System.out.println("Preço do produto: ");
	
		Scanner leitor = new Scanner(System.in);
		
			pr = leitor.nextFloat();
			
		if (pr < 20)
		{  
			vn = (float) (1,45*pr);
			
			
	System.out.println("Venda: " + vn);
	}
		
		else
		{   
			vn = (float) (1,30*pr);
			
	System.out.println("Venda: " + vn);}
		
		

	}

}
