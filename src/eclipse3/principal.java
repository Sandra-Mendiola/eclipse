package eclipse3;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2;

		System.out.println("Ingrese un n�mero entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un n�mero entero: ");
		valor2 = sc.nextInt();
		
		
		int resultado = valor1 + valor2;  //suma
		System.out.println("la suma es: " + resultado);
		
		System.out.println("Ingrese un n�mero entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un n�mero entero: ");
		valor2 = sc.nextInt();
		
		
		
		resultado = valor1 - valor2;  //resta
		System.out.println("la resta es: " + resultado);
		
		System.out.println("Ingrese un n�mero entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un n�mero entero: ");
		valor2 = sc.nextInt();
		
		
		
		resultado = valor1 * valor2;  //multiplicaci�n
		System.out.println("La multiplicacion es: " + resultado);
		
		System.out.println("Ingrese un n�mero entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un n�mero entero: ");
		valor2 = sc.nextInt();
		
		
		
		resultado = valor1 / valor2;  //divisi�n
		System.out.println("La divisi�n es: " + resultado);
		
		System.out.println("Ingrese un n�mero entero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Ingrese un n�mero entero: ");
		valor2 = sc.nextInt();
	
	}

}
