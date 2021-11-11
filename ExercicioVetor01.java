package Familia38;

public class ExercicioVetor01 {
	public static void main(String[] args) {
		
		int[] a = new int [] {1,0,5,-2,-5,-7};    //{1, 0, 5, -2, -5, -7};
		int soma =  a[0] + a[1] + a[5];
		a[4] = 100;
		
	
		for (int numeros:a)
		{
			System.out.println(numeros);
		}

		System.out.println("\nA soma de A[0], A[1] e A[5] vai ser:"+soma);
	}
}
