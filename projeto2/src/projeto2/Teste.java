package projeto2;
import java.util.Scanner;

public class Teste 
{
	public static void main(String[] args)
	{
		
		//Gato g = new Gato();
		//Utils.Teste(g);
		
		//Cachorro c = new Cachorro();
		//Utils.Teste(c);
		
		//Object o = new Gato();
		//o.setNome("Felix2");
		//Object x = g;
		//x.setNome("Mingal");
		//g = o;
		Animal animais[] = new Animal[6];
		
		for(int i = 0; i < 6; i++)
		{
			if (i % 2 == 0) 
			{
				animais[i] = new Gato();
				animais[i].setNome("Felix - "+(i+1));
			}
			else if (i % 3 == 0)
			{
				animais[i] = new Cachorro();
				animais[i].setNome("Rex - "+(i+1));
			}
			else
			{
				animais[i] = new Papagaio();
				animais[i].setNome("Louro José - "+(i+1));
			}
		}
		
		
		for(Animal animal:animais)	
		{
			Utils.Teste(animal);
		}
	}
}
