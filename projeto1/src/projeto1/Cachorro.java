package projeto1;

public class Cachorro 
{
	String nome;
	float peso;
	int idade;
	
	void latir() 
	{
		System.out.println(nome+" AUAU");
	}
	
	void comer(Comida racao) 
	{
		peso = peso + racao.foiComido();
	}
}
