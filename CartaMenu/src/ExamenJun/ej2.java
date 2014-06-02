package ExamenJun;

/**
 * 
 * @author Jose
 *
 *2. ¿Cuál es el resultado de la ejecución el siguiente código? Justifica la respuesta y/ 

solución.

public class Contador{

private int value;

public Contador(){ value =0;}

public void incrementar(){value+=1;}

public void decrementar(){value-=1;}

public static void main (String [] args){

Contador c1 = new Contador();

Contador c2 = new Contador();

System.out.println(c1.equals(c2));

}

} 
 *
 *
 */

public class ej2 {
	private int value;

	public ej2(){ value =0;}

	public void incrementar(){value+=1;}

	public void decrementar(){value-=1;}

	public static void main (String [] args){

		ej2 c1 = new ej2();

		ej2 c2 = new ej2();

	System.out.println(c1.equals(c2));

	}
}
