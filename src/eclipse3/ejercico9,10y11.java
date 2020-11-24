package eclipse3;

import java.util.Scanner;

public class ejercico9 {
	
		private static Scanner sc;

		public static void main(String[] args) {
			sc = new Scanner(System.in);
			System.out.println("Ingrese varios números enteros, y un numero negativo para finalizar");
			
			long acumulador = 0;
			int maximo = 0;
			int n;
			int minimo;
			
			n = sc.nextInt();
			
			maximo = n;
			minimo = n;
			
			
			while(n > 0)				
			{
				acumulador = acumulador + n;
				
				if (n > maximo)
				{
					maximo = n;
					minimo = n;
				}
				if (n < minimo)
				{
					minimo = n;
				}
			
		 	 n = sc.nextInt();
			}
			System.out.println("La suma es: " + acumulador);
			System.out.println("El mayor es: " + maximo );
			System.out.println("El menor es: " + minimo );


			
		}
		}
		
	
