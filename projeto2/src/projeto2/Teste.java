package projeto2;

public class Teste 
{
	public static void main(String[] args)
	{
		//as linhas comentadas são as que não rodam
		
		Gato g = new Gato();
		Utils.Teste(g);
		
		Cachorro c = new Cachorro();
		Utils.Teste(c);
		
		Object o = new Gato();
		//o.setNome("Felix2");
		Object x = g;
		//x.setNome("Mingal");
		//g = o;
	}
}
