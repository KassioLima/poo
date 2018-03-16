package projeto1;

public class Conta 
{
	private double saldo;
	
	void depositar(double val)
	{
		saldo += val;
	}
	
	boolean sacar(double val)
	{
		if(val > saldo)
		{
			//throw new RuntimeException(); //serve para dar um break caso o programador esqueça de colocar o if no caixa eletronico (if(c.sacar(val)))
			return false;
		}
		else
		{
			saldo -= val;
			return true;
		}
	}
}
