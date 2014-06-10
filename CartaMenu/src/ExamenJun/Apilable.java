package ExamenJun;
public interface Apilable{

	public void push(Object o); // añade un objeto 
	
	public Object pop(); //elimina un objeto, Si pila vacía, devuelve null. 
	
	public boolean isEmpty(); // mira si está vacia o no 
	
	public int size(); // Tamaño de la pila. 

} //interface Apilable