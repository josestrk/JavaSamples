package ExJavaColeccion362013;
/**
 * 
 * @author Jose
 * ej4
 * 
 */
public class Equipo implements Comparable,Cloneable{
	private String nombre;
	private Resultado res;
	private Conjunto conjunto;
	
	public Equipo(){
		nombre="";
		res=new Resultado();
		conjunto=new Conjunto();
	}
	
	public Equipo(String n,Resultado r,Conjunto c){
		nombre=n;
		res=r;
		conjunto=c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Resultado getRes() {
		return res;
	}

	public void setRes(Resultado res) {
		this.res = res;
	}

	public Conjunto getConjunto() {
		return conjunto;
	}

	public void setConjunto(Conjunto conjunto) {
		this.conjunto = conjunto;
	}
	
	@Override
	public int compareTo(Object arg0) {
		Equipo en=(Equipo) arg0;
		return this.nombre.compareTo(en.nombre);
	}
	
	public String toString(){
		String s="\n";
		s+="EQUIPO:\t\t"+nombre+"\nRESULTADOS: "+res+"\n PLANTILLA"+conjunto;
		return s;
	}
	
	
}
