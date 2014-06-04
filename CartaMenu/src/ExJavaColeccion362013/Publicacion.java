package ExJavaColeccion362013;

public class Publicacion implements Ordenable {
	private String titulo;
	private int numero;
	
	public Publicacion(){
		titulo="";
		numero=0;
	}
	
	public Publicacion(String titulo,int numero){
		this.titulo=titulo;
		this.numero=numero;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return "Publicacion " + titulo + "-" + numero;
	}

	@Override
	public int ordenar() {
		// TODO Auto-generated method stub
		return numero;
	}

	@Override
	public boolean prestado() {
		// TODO Auto-generated method stub
		return false;
	}

}
