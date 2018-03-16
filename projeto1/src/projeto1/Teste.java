package projeto1;

public class Teste 
{
	public static void main(String[] args)
	{
		Cachorro cachorro = new Cachorro();
		Comida racao = new Comida();
		
		cachorro.idade = 8;
		cachorro.nome = "Rex";
		cachorro.peso = 10;
		
		racao.caloria = 1;
		racao.quantidade = 5;
		racao.nome = "pedigree";
		
		System.out.println("Peso do cachorro - "+cachorro.peso);
		System.out.println("Quantidade da ração - "+racao.quantidade);
		
		cachorro.comer(racao);
		
		System.out.println("Peso do cachorro - "+cachorro.peso);
		System.out.println("Quantidade da ração - "+racao.quantidade);
	}
}
