package Diccionario;
/**
 * 
[traductor] 

palabra texto(lista enlazada de palabras) libro(array de traducibles)

interfaz traducible  traduce y coste

clase diccionario estructura map calve palabra y valor otra palabra
 * 
 * */

public class mainprueba {
	public static void main(String[] arg){
		System.out.println("Diccionario");
		Diccionario dic=new Diccionario();
		dic.add("hola", "alo");
		dic.add("adios", "bye");
		dic.add("qtal", "nada");
		
		Palabra pal= new Palabra("hola");
		
		pal.traduce(dic);
		
		System.out.println(pal);
		
		
		Palabra pal2= new Palabra("hola");
		Palabra pal3= new Palabra("adios");
		Palabra pal4= new Palabra("qtal");
		Texto tex = new Texto();
		tex.add(pal2);
		tex.add(pal3);
		tex.add(pal4);

		System.out.println(tex);//hola
		
		tex.traduce(dic);//traduceme
		
		System.out.println(tex);//alo
		
		
	}
}
