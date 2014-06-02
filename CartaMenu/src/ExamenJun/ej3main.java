package ExamenJun;

public class ej3main {

	public static void main(String[] args) {
		ej3 pila=new ej3();
		pila.push("uno");
		pila.push("dos");
		pila.push("tres");
		pila.push("cuatr");
		System.out.println(pila.size());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.size());
		System.out.println(pila.pop());
	}

}
