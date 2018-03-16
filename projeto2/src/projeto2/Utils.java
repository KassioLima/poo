package projeto2;

public class Utils 
{
	public static void Teste(Animal a)
	{
		if(a instanceof Gato)
		{
			Gato k = (Gato)a;
			k.miar();
		}
		if(a instanceof Cachorro)	
		{
			Cachorro k = (Cachorro)a;
			k.latir();
		}
		//a.miar(); animal não tem o método miar, pois nem todo animal é um gato
	}
}
