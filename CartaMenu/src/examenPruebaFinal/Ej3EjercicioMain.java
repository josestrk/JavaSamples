package examenPruebaFinal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej3EjercicioMain {

	public static void main(String[] args) {
		Ej1Examen ex=new Ej1Examen(100, "SIS", new Fecha(21,3,2013), new Hora(1,30));
		Ej1Examen ex2=new Ej1Examen(200, "MIB", new Fecha(1,1,2013), new Hora(10,30));
		Ej1Examen ex3=new Ej1Examen(9, "TIC", new Fecha(20,10,2013), new Hora(12,30));
		Ej1Examen ex4=new Ej1Examen(100, "ASI", new Fecha(31,12,2013), new Hora(12,30));
		Ej1Examen ex5=new Ej1Examen(200, "ASI", new Fecha(31,12,2013), new Hora(12,20));
		Ej1Examen ex6=new Ej1Examen(300, "ASI", new Fecha(31,12,2013), new Hora(12,30));
		
		String[] al={"ma","me","mi"};
		String[] al2={"ma","me","mi","ma","me","mi","ma"};
		Ej1Proyecto p=new Ej1Proyecto(new Fecha(10,1,2013), new Hora(11, 30), "Meca",al);
		Ej1Proyecto p2=new Ej1Proyecto(new Fecha(6,2,2013), new Hora(42, 30), "Meca",al2);
		Ej1Proyecto p3=new Ej1Proyecto(new Fecha(1,1,2013), new Hora(12, 30), "Palo",al2);

		Ej1Examenes e=new Ej1Examenes();
		e.add(ex);e.add(ex2);e.add(ex3);e.add(ex4);
		e.add(p);e.add(p2);e.add(p3);
		
		Ej1Examenes e2=new Ej1Examenes();
		e2.add(p2);e2.add(ex5);e2.add(ex6);
		
		Ej1Grupo g=new Ej1Grupo("DAI",4);
		Ej1Grupo g2=new Ej1Grupo("ASIR",6);
		
		Ej1ExamenesFinales ef=new Ej1ExamenesFinales();
		
		ef.add(g, e);
		ef.add(g2, e2);
		
		System.out.println("Ordenar grupos del informe por: \n1.fecha\n2.Num Alumno\n3.Modulo Ordenar:");
		Scanner src=new Scanner(System.in);
		int op=src.nextInt();
		
		switch(op){
		case 2:
			CompareNumAlumnos c=new CompareNumAlumnos();
			e.ordenado(c);
			break;
		case 3:
			CompararModulo c2=new CompararModulo();
			e.ordenado(c2);
			break;
		}
		//abro flujo
		String doc="ExamenesJunio.dat";
		FileWriter escribir;
		try{
			escribir=new FileWriter(doc);
		
			escribir.write("___________________________________________________________________");
			escribir.write("Grupos");
			escribir.write("\n "+ef);
			escribir.write("___________________________________________________________________");
			escribir.close();
			
			System.out.println("Informe emitido correctamente a:"+doc);
		}catch (IOException excep){
			System.out.println(excep.getMessage());
		}
		
		

	}

}
