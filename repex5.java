	import java.util.Scanner;

	public class repex5{

		public static void main(String[] args) {
		
	
		
		
			
			
			double maioralt=0, menoralt=1000,soma=0, alt, sal, md=0;
		
			
			String sx;
		
			
			int qtdm=0, cl=1;
		
			
			
			
			
		do {
		
			
	System.out.println("Sexo" +cl+ "funcionario M masculino ou F feminino: ");
		Scanner leitor = new Scanner(System.in);
		
		sx = leitor.next();
	System.out.println("Salário funcionario: ");
		
	sal = leitor.nextDouble();
	
	System.out.println("Altura em CM: ");
		alt = leitor.nextDouble();
		
		
		if (alt>maioralt)
			{maioralt=alt;}
		
		if (alt<menoralt)
			{menoralt=alt;}
		
		if (sx.equals("F")&&(sal<=1000.00))
		
		{qtdm++;}
		
		soma+=sal;
		md=soma/cl;
		c++;
		}
		while (c<=20);
		
		
		System.out.println("Média salário:R$"+md);
		System.out.println("A maior altura: " +maioralt+ " cm");
		System.out.println("A menor altura:" +menoralt + "cm");
		System.out.println("A mulheres com osalário - R$1000,00 :" +qtdm);
		
		

	}

}