package ExamenJun;
public interface Apilable{

	public void push(Object o); // a�ade un objeto 
	
	public Object pop(); //elimina un objeto, Si pila vac�a, devuelve null. 
	
	public boolean isEmpty(); // mira si est� vacia o no 
	
	public int size(); // Tama�o de la pila. 

} //interface Apilable