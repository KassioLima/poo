package projeto1;

import java.util.Scanner;

public class LeituraTeclado 
{
	public static void main(String[] args)
	{
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite o número de lementos --> ");
		int quantidade = entrada.nextInt();
		int soma = 0;
		
		for(int i = 0; i<quantidade; i++) 
		{
			System.out.println("Digite o "+(i+1)+"º valor --> ");
			soma += entrada.nextInt();
		}
		
		float media = soma/quantidade;
		System.out.println("Média = "+media);
		entrada.close();
		
//		int [] x = new int [15];
//		for(int i = 1; i <= x.length; i++)
//		{
//			if(i<x.length)
//			System.out.print(i+", ");
//			else
//			System.out.print(i);
//		}
		
	}
}
