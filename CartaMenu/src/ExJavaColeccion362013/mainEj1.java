package ExJavaColeccion362013;

public class mainEj1 {
	public static void main(String[] args){
	Libro e1=new Libro("robinones",2,false);
	Libro e2=new Libro("metamorfo",1,true);
	Libro e3=new Libro("robi",6,false);
	Libro e4=new Libro("res",3,true);
	
	Publicacion p1=new Publicacion("Marea", 10);
	Publicacion p2=new Publicacion("esparta",1);
	
	Biblioteca bib=new Biblioteca();
	bib.add(e1);
	bib.add(e2);bib.add(e3);bib.add(e4);
	
	bib.add(p1);bib.add(p2);
	
	System.out.println(bib);
	
	System.out.println(bib.toStringNPres());
	
	}
}
