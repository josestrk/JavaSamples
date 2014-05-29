package examenPruebaFinal;

public class Ej1Proyecto implements Ej1Examinable,Comparable {
	private Fecha f;
	private Hora h;
	private String titulo;
	private String[] alumnos;
	
	public Ej1Proyecto(Fecha f,Hora h,String titulo,String[] al){
		this.f=f;
		this.h=h;
		this.titulo=titulo;
		this.alumnos=al;
	}
	
	public Fecha getF(){
		return f;
	}
	public Hora getH(){
		return h;
	}
	public String getTitulo(){
		return titulo;
	}
	public String[] getAlumnos(){
		return alumnos;
	}
	
	public String toString(){
		String s="(-Proyecto-)"+titulo+"-"+f+"/"+h+"\t--";
		for(int i=0;i<alumnos.length;i++){
			s+=alumnos[i]+" | ";
		}
		return s;
	}

	@Override
	public int hayAlumnos() throws HayPocos {
		if(alumnos.length>10){
			return alumnos.length;
		}else{
			throw new HayPocos();
		}
	}

	@Override
	public Fecha FechaprimerDia() {
		return f;
	}
	
	public int compareTo(Object o) {
		//comparo por fecha y hora que es lo que implementa la interfaz
		Ej1Proyecto p=(Ej1Proyecto) o;
		
		ComparaFecha c=new ComparaFecha();
		int fe=c.compare(this.getF(), ((Ej1Proyecto)o).getF());
		if(fe==0){
			ComparaHora ho=new ComparaHora();
			return ho.compare(this.getH(),p.getH());
		}
		return fe;
	}
	
	
}
