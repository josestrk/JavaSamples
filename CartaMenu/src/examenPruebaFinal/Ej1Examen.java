package examenPruebaFinal;


public class Ej1Examen implements Ej1Examinable,Comparable {
	private Fecha f;
	private Hora h;
	private String modulo;
	private int numAlumnos;
	
	public Ej1Examen(int numAlumno,String modulo,Fecha f,Hora h){
		this.numAlumnos=numAlumno;
		this.modulo=modulo;
		this.f=f;
		this.h=h;
	}
	
	public int hayAlumnos() throws HayPocos {
		if (numAlumnos>10){
			return 0;
		}else{
			throw new HayPocos();
		}
	}
	@Override
	public Fecha FechaprimerDia() {
		return f;
	}
	
	public Hora getH(){
		return h;
	}
	public Fecha getF(){
		return f;
	}
	public int getNumAlumnos(){
		return numAlumnos;
	}
	public String getModulo(){
		return modulo;
	}
	
	public String toString(){
		return "(+Examen+)\t"+numAlumnos+"-"+modulo+"-"+f+"-"+h;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

//	public int compareTo(Object o) {
//		//comparo por fecha y hora que es lo que implementa la interfaz
//		Ej1Examen e=(Ej1Examen) o;
//		ComparaFecha c=new ComparaFecha();
//		int fe=c.compare(this.getF(), e.getF());
//		if(fe==0){
//			ComparaHora ho=new ComparaHora();
//			return ho.compare(this.getH(),e.getH());
//		}
//		return fe;
//	}
}
