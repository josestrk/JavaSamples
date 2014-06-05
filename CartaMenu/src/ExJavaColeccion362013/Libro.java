package ExJavaColeccion362013;

public class Libro implements Ordenable{
	private String titulo;
	private int id;
	private boolean pres=false;
	public Libro(){
		titulo="";
		id=0;
		pres=false;
	}
	
	public Libro(String titulo,int id,boolean pres){
		this.titulo=titulo;
		this.id=id;
		this.pres=pres;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPres() {
		return pres;
	}

	public void setPres(boolean pres) {
		this.pres = pres;
	}
	
	@Override
	public String toString() {
		return "Libro " + titulo + " - " + id + ", prestado:" + pres;
	}

	@Override
	public int ordenar() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public boolean prestado() {
		// TODO Auto-generated method stub
		return pres;
	}
	
}
