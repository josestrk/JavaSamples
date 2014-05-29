package examenPruebaFinal;

public class ej1Main {
	public static void main(String[] args){
		Ej1Examen ex=new Ej1Examen(100, "SIS", new Fecha(21,3,2013), new Hora(1,30));
		Ej1Examen ex2=new Ej1Examen(200, "MIB", new Fecha(1,1,2013), new Hora(10,30));
		Ej1Examen ex3=new Ej1Examen(9, "TIC", new Fecha(20,10,2013), new Hora(12,30));
		Ej1Examen ex4=new Ej1Examen(100, "ASI", new Fecha(31,12,2013), new Hora(12,30));
		Ej1Examen ex5=new Ej1Examen(200, "ASI", new Fecha(31,12,2013), new Hora(12,20));
		Ej1Examen ex6=new Ej1Examen(300, "ASI", new Fecha(31,12,2013), new Hora(12,30));
		
		String[] al={"ma","me","mi"};
		String[] al2={"ma","me","mi","ma","me","mi","ma","me","mi","ma","me","mi","ma","me","mi"};
		Ej1Proyecto p=new Ej1Proyecto(new Fecha(10,1,2013), new Hora(11, 30), "Meca",al);
		Ej1Proyecto p2=new Ej1Proyecto(new Fecha(6,2,2013), new Hora(42, 30), "Meca",al2);
		Ej1Proyecto p3=new Ej1Proyecto(new Fecha(1,1,2013), new Hora(12, 30), "Palo",al2);

		Ej1Examenes e=new Ej1Examenes();
		e.add(ex);e.add(ex2);e.add(ex3);e.add(ex4);e.add(ex5);e.add(ex6);
		e.add(p);e.add(p2);e.add(p3);
		
		// como puedo hacer para que compare los examenes y no los proyectos para la ordenacion por modulo y numAlumno
		
		System.out.println("____FECHA______");
		System.out.println(e);
		System.out.println("FIN");
		
		System.out.println("____NumAlumno______");
		CompareNumAlumnos c=new CompareNumAlumnos();
		e.Ordenado(c);
		System.out.println(e);
		System.out.println("FIN");
		
		
		System.out.println("____Modulo______");
		CompararModulo c2=new CompararModulo();
		e.Ordenado(c2);
		System.out.println(e);
		System.out.println("FIN");
	}
}
