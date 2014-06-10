package examenPruebaFinal;


public class Ej2EjercicioFuncion {
	private Ej2Cola c;
	
	public int extraer(int el){// extraer el dato 'el'
		Ej2Cola aux=new Ej2Cola();//cola para auxiliar para que extraigo 'el'
		int sel=0;//para comparar lo que extraigo con 'el'
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
			return el;//encontre en c lo que buscaba y lo rellene sin 'el' 
		else
			return 0;//no esta en c
	}
}
