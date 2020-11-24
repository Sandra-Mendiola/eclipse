package eclipse3;

import java.util.Scanner;

public class principal {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int valor1, valor2;
		 try{

		System.out.println("Ingrese un número entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un número entero: ");
		valor2 = sc.nextInt();
		
		
		int resultado = valor1 + valor2;  //suma
		System.out.println("la suma es: " + resultado);
		
		System.out.println("Ingrese un número entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un número entero: ");
		valor2 = sc.nextInt();
		
		
		
		resultado = valor1 - valor2;  //resta
		System.out.println("la resta es: " + resultado);
		
		System.out.println("Ingrese un número entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un número entero: ");
		valor2 = sc.nextInt();
		
		
		
		resultado = valor1 * valor2;  //multiplicación
		System.out.println("La multiplicacion es: " + resultado);
		
		System.out.println("Ingrese un número entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un número entero: ");
		valor2 = sc.nextInt();
		
		
		if (valor2 !=0)
		{
		resultado = valor1 / valor2;  //división
		System.out.println("La división es: " + resultado);	
		
		System.out.println("Ingrese un número entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un número entero: ");
		valor2 = sc.nextInt();
		}
		else
		{
			System.out.println("No se puede dividir por cero");	
		}
		 }
	catch(Exception ex)
	{
		System.out.println("Ingreso un valor inesperado y el programa se cierra");
	}
  }
}
