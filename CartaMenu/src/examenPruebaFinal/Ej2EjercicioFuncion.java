package examenPruebaFinal;


public class Ej2EjercicioFuncion {
	private static Ej2Cola c;
	
	public static int extraer(int el){
		Ej2Cola aux=new Ej2Cola();
		int sel=0;
		boolean sw=false;
		while(!c.isEmpty()){
			sel=(Integer)c.remove();
			if(sel==el){
				sw=true;
			}else{
				aux.add(sel);
			}
		}
		while(!aux.isEmpty())
			c.add(aux.remove());
		if(sw)
			return el;
		else
			return 0;
	}
}
