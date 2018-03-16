package projeto1;

import java.util.Scanner;

public class CaixaAutomatico 
{
	public static void main(String[] args)
	{
		Conta c = new Conta();
		Scanner s =  new Scanner(System.in);
		
		System.out.println("Quanto quer depositar? ");
		double deposito = s.nextDouble();
		c.depositar(deposito);
		
		System.out.println("Quanto quer sacar? ");
		double val = s.nextDouble();
		
		if(c.sacar(val))
		{
			System.out.println("SACADO");
			//System.out.println("SACADO\nSALDO RESTANTE: "+c.saldo);		
		}
		else
		System.out.println("SALDO INSUFICIENTE");	
		s.close();
	}
}
