package segundo_trimestre;

import java.util.ArrayList;
import java.util.Scanner;

import javax.crypto.MacSpi;

public class act_ev_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int respuesta;
		ArrayList<String> listaNombres = new ArrayList<String>();
		ArrayList<Integer> listaAntiguedades = new ArrayList<Integer>();
		
		do {
			System.out.println(" 1. Alta cliente");
			System.out.println(" 2. Baja cliente");
			System.out.println(" 3. Módificacion cliente");
			System.out.println(" 4. Consulta clientes");
			System.out.println(" 5. Estadisticas");
			System.out.println(" 9. Salir");
			respuesta = sc.nextInt();
			
			switch (respuesta) {
			case 1 -> {alta(listaNombres, listaAntiguedades, sc);}
			case 2 -> {baja(listaNombres, listaAntiguedades, sc);}
			case 3 -> {modificacion(listaNombres, listaAntiguedades, sc);}
			case 4 -> { System.out.println(" Usuarios:" + listaNombres + "Antiguedad:" + listaAntiguedades);}
			case 5 -> {estadistica(listaAntiguedades);}
			case 9 -> {System.out.println(" Adioosssssss!!!");}
			
			}
			
		} while (respuesta != 9);

	}
	
	private static void alta(ArrayList<String> listaNombres, ArrayList<Integer> listaAntiguedades, Scanner sc)
	{
		System.out.println( "¿Cual es tu nombre?");
		
		listaNombres.add(sc.next());

		System.out.println( "¿Cual es su antiguedad?");
		
		listaAntiguedades.add(sc.nextInt());
		
	}
	
	private static void baja (ArrayList<String> listaNombres, ArrayList<Integer> listaAntiguedades, Scanner sc)
	{
		String nombre;
		
		System.out.println(" Introduzca un nombre de usuario");
		
		nombre = sc.next();
		
		for (int i = 0; i < listaNombres.size(); i++ ) {
		if (nombre.equals(listaNombres.get(i)))
		{
			char si;

			System.out.println(" ¿Seguro quieres borrarlo? S = Si, N = No");
			
			si = sc.next().charAt(0);
			if (si == 'S' ) {
				listaNombres.remove(i);
				listaAntiguedades.remove(i);
			}
			else if (si == 'N');
		}
		}
	}
	
	private static void estadistica (ArrayList<Integer> listaAntiguedades) 
	{int media = 0;
	int mayorA = 999999999;
	int menorA = 0;
	
	for (int i = 0; i < listaAntiguedades.size(); i++ ) 
	{media += listaAntiguedades.get(i);
	if (mayorA > listaAntiguedades.get(i)){
		mayorA = listaAntiguedades.get(i);
	}
	if (menorA < listaAntiguedades.get(i)){
		menorA = listaAntiguedades.get(i);
	}
		
	}
	media = media/listaAntiguedades.size();
	
	System.out.println(" Media:" + media + "Menor Antiguedad" + mayorA + " Mayor Antiguedad" + menorA);
	
	}
	
	private static void modificacion(ArrayList<String> listaNombres, ArrayList<Integer> listaAntiguedades, Scanner sc)
	
	{String nombre;
	int antiguedad;
	
	System.out.println(" Introduzca un nombre de usuario");
	
		nombre = sc.next();
		
		for (int i = 0; i < listaNombres.size(); i++ ) {
		if (nombre.equals(listaNombres.get(i)))
		{System.out.println(listaAntiguedades.get(i) + " Nueva Antiguedad:");
		antiguedad = sc.nextInt();
		listaAntiguedades.set(i, antiguedad); break;
		}
		else {System.out.println(" cliente no encontrado");}
	}
}
}

 	