package Familia38;

import java.util.Scanner;

public class ExercicioMatriz01 {
	public static void main(String[] args) {
		
		int[][] tabela = new int [3][3];
		int linha,coluna, maior10=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um valor: ");	
				tabela[linha][coluna] = ler.nextInt();
				if(tabela[linha][coluna]>=10)
				{
					maior10++;
				}
					
			}

		}
		System.out.println("Foi entrado na matriz um valor acima de 10 "+maior10+" vezes");

	}

}
