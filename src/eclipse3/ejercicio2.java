package eclipse3;

import java.util.Scanner;

public class e2 {
	private static Scanner sc;

	public static void main(String[] args)
	{
	
		sc = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.println("Ingrese un número entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un número entero: ");
		valor2 = sc.nextInt();
		
		if(valor1>valor2)
			System.out.println("El numero mayor es: " + valor1);
		
		if(valor1<valor2)
			System.out.println("El numero mayor es: " + valor2);
		
		if(valor1==valor2)
			System.out.println("Ambos numeros son iguales: " );
	}

}


