package eclipse3;

import java.util.Scanner;

public class ejercicio6 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
	
	short mes;
	sc = new Scanner (System.in);

	System.out.println("Ingrese un número entre 1 y 12");
	mes=(short)sc.nextInt();
	
	switch(mes)
	{
	
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:			
	case 12:
		System.out.println("El mes tiene 31 días");
	break;
	
	case 2:
		System.out.println("El mes tiene 28 días");
	break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("El mes tiene 30 días");
	break;
	default:
	System.out.println("El número ingresado no esta entre 1 y 12");
	}
}

}
