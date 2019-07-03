package logic;
//import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import org.jpl7.*;

public class MainEjemplo {
   
	public static void main(String[] args) {
		Variable Res = new Variable("Res");
		Query ql = new Query(
    		"consult('/home/josecl200/Documents/PUCMM/ISC/ISC-317/Lab/tarea1.pl')");
		System.out.println("consulta " + (ql.hasSolution() ? "good" : "bad"));	
		//int entero=0;
		System.out.println("Escriba lo que quiere buscar");
		Scanner regla = new Scanner(System.in);
		String reglaSt = regla.nextLine();
		//Scanner numero = new Scanner(System.in);
		//entero=numero.nextInt();
		//numero.close();
		regla.close();
		Query busqueda = new Query(
			reglaSt,
			new Term[] {Res}
		);
		System.out.println("busqueda " + (busqueda.hasSolution() ? "good" : "bad"));	
		Map<String, Term>[] sol = busqueda.allSolutions();
		System.out.println("Busqueda de " + reglaSt + ": ");
		for (int i = 0; i<sol.length;i++) {
			System.out.println(sol[i].get("Res"));
		}
		
		
		/*while (busqueda.hasMoreSolutions()){
			System.out.println(busqueda.nextSolution().get("Res"));
		}*/
			
		
	}
}
