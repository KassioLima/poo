package projeto1;

public class Comida 
{
	int quantidade;
	float caloria;
	String nome;
	
	float foiComido()
	{
		quantidade--;
		System.out.println("\nCOMEU\n");
		return caloria;
	}
}
