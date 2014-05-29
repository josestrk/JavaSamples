package examenPruebaFinal;

public class ej1Main {
	public static void main(String[] args){
		Ej1Examen ex=new Ej1Examen(100, "SIS", new Fecha(21,3,2013), new Hora(1,30));
		Ej1Examen ex2=new Ej1Examen(200, "MIB", new Fecha(1,1,2013), new Hora(10,30));
		Ej1Examen ex3=new Ej1Examen(9, "TIC", new Fecha(20,10,2013), new Hora(12,30));
		Ej1Examen ex4=new Ej1Examen(100, "ASI", new Fecha(31,12,2013), new Hora(12,30));
		
		System.out.println(ex);
		
		String[] al={"ma","me","mi"};
		String[] al2={"ma","me","mi","ma","me","mi","ma","me","mi","ma","me","mi","ma","me","mi"};
		Ej1Proyecto p=new Ej1Proyecto(new Fecha(1,1,2013), new Hora(11, 30), "Mecanica",al);
		Ej1Proyecto p2=new Ej1Proyecto(new Fecha(6,2,2013), new Hora(11, 30), "Mecanica",al);
		Ej1Proyecto p3=new Ej1Proyecto(new Fecha(1,1,2013), new Hora(12, 30), "Palo",al2);
		
		System.out.println(p);
		
		Ej1Examenes e=new Ej1Examenes();
		e.add(ex);e.add(ex2);e.add(ex3);e.add(ex4);
		e.add(p);e.add(p2);e.add(p3);
		
		System.out.println("__________");
		System.out.println(e);
		System.out.println("FIN");

	}
}
